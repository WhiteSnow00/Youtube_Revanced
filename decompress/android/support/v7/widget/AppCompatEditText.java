// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.app.Activity;
import android.content.ContextWrapper;
import android.view.DragEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.textclassifier.TextClassifier;
import android.os.Build$VERSION;
import android.text.Editable;
import android.view.ActionMode$Callback;
import android.text.method.KeyListener;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.EditText;

public class AppCompatEditText extends EditText implements alx
{
    private final ka a;
    private final lc b;
    private final apw c;
    private final bkh d;
    private final baa e;
    private qpt f;
    
    public AppCompatEditText(final Context context) {
        this(context, null);
    }
    
    public AppCompatEditText(final Context context, final AttributeSet set) {
        this(context, set, 2130969300);
    }
    
    public AppCompatEditText(final Context context, final AttributeSet set, int inputType) {
        pn.a(context);
        super(context, set, inputType);
        pl.d((View)this, this.getContext());
        (this.a = new ka((View)this)).b(set, inputType);
        final lc b = new lc((TextView)this);
        (this.b = b).g(set, inputType);
        b.e();
        this.d = new bkh((TextView)this);
        this.c = new apw();
        (this.e = new baa((EditText)this)).i(set, inputType);
        final KeyListener keyListener = this.getKeyListener();
        if (baa.j(keyListener)) {
            final boolean focusable = super.isFocusable();
            final boolean clickable = super.isClickable();
            final boolean longClickable = super.isLongClickable();
            inputType = super.getInputType();
            final KeyListener k = baa.k(keyListener);
            if (k != keyListener) {
                super.setKeyListener(k);
                super.setRawInputType(inputType);
                super.setFocusable(focusable);
                super.setClickable(clickable);
                super.setLongClickable(longClickable);
            }
        }
    }
    
    private final qpt b() {
        if (this.f == null) {
            this.f = new qpt(this);
        }
        return this.f;
    }
    
    public final ald a(final ald ald) {
        return this.c.a((View)this, ald);
    }
    
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        final ka a = this.a;
        if (a != null) {
            a.a();
        }
        final lc b = this.b;
        if (b != null) {
            b.e();
        }
    }
    
    public final ActionMode$Callback getCustomSelectionActionModeCallback() {
        return api.d(super.getCustomSelectionActionModeCallback());
    }
    
    public final Editable getText() {
        if (Build$VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
    
    public final TextClassifier getTextClassifier() {
        if (Build$VERSION.SDK_INT < 28) {
            final bkh d = this.d;
            if (d != null) {
                return d.i();
            }
        }
        return ((EditText)this.b().a).getTextClassifier();
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        lc.r((TextView)this, onCreateInputConnection, editorInfo);
        fn.d(onCreateInputConnection, editorInfo, (View)this);
        Object o = onCreateInputConnection;
        if (onCreateInputConnection != null) {
            o = onCreateInputConnection;
            if (Build$VERSION.SDK_INT <= 30) {
                final String[] at = ana.at((View)this);
                o = onCreateInputConnection;
                if (at != null) {
                    editorInfo.contentMimeTypes = at;
                    final qpt qpt = new qpt((View)this);
                    afa.c(editorInfo, "editorInfo must be non-null");
                    o = new apc(onCreateInputConnection, qpt, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
                }
            }
        }
        return this.e.l((InputConnection)o);
    }
    
    public final boolean onDragEvent(final DragEvent dragEvent) {
        if (Build$VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null) {
            if (ana.at((View)this) != null) {
                Context context = ((View)this).getContext();
                while (true) {
                    while (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            final Activity activity = (Activity)context;
                            if (activity == null) {
                                new StringBuilder("Can't handle drop: no activity: view=").append(this);
                                return super.onDragEvent(dragEvent);
                            }
                            if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                                km.a(dragEvent, (TextView)this, activity);
                                return true;
                            }
                            return super.onDragEvent(dragEvent);
                        }
                        else {
                            context = ((ContextWrapper)context).getBaseContext();
                        }
                    }
                    final Activity activity = null;
                    continue;
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }
    
    public final boolean onTextContextMenuItem(int n) {
        if (Build$VERSION.SDK_INT < 31 && ana.at((View)this) != null) {
            int n2;
            if ((n2 = n) != 16908322) {
                if (n != 16908337) {
                    return super.onTextContextMenuItem(n);
                }
                n2 = 16908337;
            }
            final ClipboardManager clipboardManager = (ClipboardManager)((TextView)this).getContext().getSystemService("clipboard");
            ClipData primaryClip;
            if (clipboardManager == null) {
                primaryClip = null;
            }
            else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                Object o;
                if (Build$VERSION.SDK_INT >= 31) {
                    o = new akx(primaryClip, 1);
                }
                else {
                    o = new akz(primaryClip, 1);
                }
                if (n2 == 16908322) {
                    n = 0;
                }
                else {
                    n = 1;
                }
                ((aky)o).c(n);
                ana.r((View)this, afi.f((aky)o));
            }
            return true;
        }
        return super.onTextContextMenuItem(n);
    }
    
    public final void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final ka a = this.a;
        if (a != null) {
            a.e();
        }
    }
    
    public final void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final ka a = this.a;
        if (a != null) {
            a.c(backgroundResource);
        }
    }
    
    public final void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final lc b = this.b;
        if (b != null) {
            b.e();
        }
    }
    
    public final void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final lc b = this.b;
        if (b != null) {
            b.e();
        }
    }
    
    public final void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(api.e((TextView)this, actionMode$Callback));
    }
    
    public final void setKeyListener(final KeyListener keyListener) {
        super.setKeyListener(baa.k(keyListener));
    }
    
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final lc b = this.b;
        if (b != null) {
            b.h(context, n);
        }
    }
    
    public final void setTextClassifier(final TextClassifier textClassifier) {
        if (Build$VERSION.SDK_INT < 28) {
            final bkh d = this.d;
            if (d != null) {
                d.b = textClassifier;
                return;
            }
        }
        ((EditText)this.b().a).setTextClassifier(textClassifier);
    }
}
