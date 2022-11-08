// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.ndk.base;

import android.os.Handler;
import java.util.Iterator;
import android.view.WindowManager$InvalidDisplayException;
import android.util.Log;
import android.view.ViewGroup$LayoutParams;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.view.View;
import android.app.Presentation;
import android.widget.FrameLayout;
import java.util.List;
import android.widget.RelativeLayout$LayoutParams;
import com.google.vr.cardboard.DisplaySynchronizer;
import android.hardware.display.DisplayManager;
import android.content.Context;
import android.hardware.display.DisplayManager$DisplayListener;

class GvrLayoutImpl$PresentationHelper implements DisplayManager$DisplayListener
{
    private final Context context;
    private final DisplayManager displayManager;
    private final DisplaySynchronizer displaySynchronizer;
    private String externalDisplayName;
    private final RelativeLayout$LayoutParams layout;
    private final List listeners;
    private final FrameLayout originalParent;
    private Presentation presentation;
    private final View view;
    
    public GvrLayoutImpl$PresentationHelper(final Context context, final FrameLayout originalParent, final View view, final DisplaySynchronizer displaySynchronizer, final String externalDisplayName) {
        this.layout = new RelativeLayout$LayoutParams(-1, -1);
        this.context = context;
        this.originalParent = originalParent;
        this.view = view;
        this.displaySynchronizer = displaySynchronizer;
        this.externalDisplayName = externalDisplayName;
        this.displayManager = (DisplayManager)context.getSystemService("display");
        this.listeners = new ArrayList();
    }
    
    private static void detachViewFromParent(final View view) {
        final ViewGroup viewGroup = (ViewGroup)view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }
    
    private boolean hasCurrentPresentationExpired() {
        final Presentation presentation = this.presentation;
        return presentation != null && (!presentation.isShowing() || !this.presentation.getDisplay().isValid());
    }
    
    private boolean isValidExternalDisplay(final Display display) {
        return display != null && display.isValid() && display.getName().equals(this.externalDisplayName);
    }
    
    private void setDisplay(Display display) {
        final Presentation presentation = this.presentation;
        Display display2;
        if (presentation != null) {
            display2 = presentation.getDisplay();
        }
        else {
            display2 = null;
        }
        Label_0130: {
            if (!this.hasCurrentPresentationExpired()) {
                if (display != display2) {
                    if (display == null) {
                        break Label_0130;
                    }
                    if (display2 == null) {
                        break Label_0130;
                    }
                    if (display.getDisplayId() != display2.getDisplayId() || display.getFlags() != display2.getFlags() || display.isValid() != display2.isValid() || !display.getName().equals(display2.getName())) {
                        break Label_0130;
                    }
                    final DisplayMetrics displayMetrics = new DisplayMetrics();
                    final DisplayMetrics displayMetrics2 = new DisplayMetrics();
                    display.getMetrics(displayMetrics);
                    display2.getMetrics(displayMetrics2);
                    if (!displayMetrics.equals(displayMetrics2)) {
                        break Label_0130;
                    }
                }
                return;
            }
        }
        final Presentation presentation2 = this.presentation;
        if (presentation2 != null) {
            presentation2.dismiss();
            this.presentation = null;
        }
        detachViewFromParent(this.view);
        if (display != null) {
            Presentation create;
            if (GvrLayoutImpl.-$$Nest$sfgetsOptionalPresentationFactory() != null) {
                create = GvrLayoutImpl.-$$Nest$sfgetsOptionalPresentationFactory().create(this.context, display);
            }
            else {
                create = new Presentation(this.context, display);
            }
            (this.presentation = create).addContentView(this.view, (ViewGroup$LayoutParams)this.layout);
            try {
                this.presentation.show();
            }
            catch (final WindowManager$InvalidDisplayException ex) {
                Log.e("GvrLayoutImpl", "Attaching Cardboard View to the external display failed: ".concat(ex.toString()));
                this.presentation.cancel();
                this.presentation = null;
                detachViewFromParent(this.view);
                this.originalParent.addView(this.view, 0);
            }
        }
        else {
            this.originalParent.addView(this.view, 0);
        }
        final DisplaySynchronizer displaySynchronizer = this.displaySynchronizer;
        final Presentation presentation3 = this.presentation;
        if (presentation3 != null) {
            display = presentation3.getDisplay();
        }
        else {
            display = aqzg.r(this.context);
        }
        displaySynchronizer.d(display);
        if (presentation2 != null) {
            final Iterator iterator = this.listeners.iterator();
            while (iterator.hasNext()) {
                ((GvrLayoutImpl$PresentationListener)iterator.next()).onPresentationStopped();
            }
        }
        if (this.presentation != null) {
            final Iterator iterator2 = this.listeners.iterator();
            while (iterator2.hasNext()) {
                ((GvrLayoutImpl$PresentationListener)iterator2.next()).onPresentationStarted(this.presentation.getDisplay());
            }
        }
    }
    
    public boolean isPresenting() {
        final Presentation presentation = this.presentation;
        return presentation != null && presentation.isShowing();
    }
    
    public void onDetachedFromWindow() {
        this.displayManager.unregisterDisplayListener((DisplayManager$DisplayListener)this);
        this.setDisplay(null);
    }
    
    public void onDisplayAdded(final int n) {
        final Display display = this.displayManager.getDisplay(n);
        if (this.isValidExternalDisplay(display)) {
            this.setDisplay(display);
        }
    }
    
    public void onDisplayChanged(final int n) {
    }
    
    public void onDisplayRemoved(final int n) {
        final Presentation presentation = this.presentation;
        if (presentation != null && presentation.getDisplay().getDisplayId() == n) {
            this.setDisplay(null);
        }
    }
    
    public void onPause() {
        this.displayManager.unregisterDisplayListener((DisplayManager$DisplayListener)this);
    }
    
    public void onResume() {
        final String s = aqzg.s(this.context);
        this.externalDisplayName = s;
        final Display display = null;
        if (s == null) {
            this.setDisplay(null);
            return;
        }
        this.displayManager.registerDisplayListener((DisplayManager$DisplayListener)this, (Handler)null);
        final Display[] displays = this.displayManager.getDisplays();
        final int length = displays.length;
        int n = 0;
        Display display2;
        while (true) {
            display2 = display;
            if (n >= length) {
                break;
            }
            display2 = displays[n];
            if (this.isValidExternalDisplay(display2)) {
                break;
            }
            ++n;
        }
        this.setDisplay(display2);
    }
    
    public void shutdown() {
        this.displayManager.unregisterDisplayListener((DisplayManager$DisplayListener)this);
        final Presentation presentation = this.presentation;
        if (presentation != null) {
            presentation.cancel();
            this.presentation = null;
            final Iterator iterator = this.listeners.iterator();
            while (iterator.hasNext()) {
                ((GvrLayoutImpl$PresentationListener)iterator.next()).onPresentationStopped();
            }
        }
    }
}
