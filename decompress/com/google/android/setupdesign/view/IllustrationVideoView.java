// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.setupdesign.view;

import android.view.View$MeasureSpec;
import java.io.IOException;
import android.util.Log;
import java.util.Map;
import android.net.Uri;
import android.graphics.SurfaceTexture;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.Surface;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnErrorListener;
import android.media.MediaPlayer$OnInfoListener;
import android.media.MediaPlayer$OnSeekCompleteListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.view.TextureView$SurfaceTextureListener;
import android.graphics.drawable.Animatable;
import android.view.TextureView;

public class IllustrationVideoView extends TextureView implements Animatable, TextureView$SurfaceTextureListener, MediaPlayer$OnPreparedListener, MediaPlayer$OnSeekCompleteListener, MediaPlayer$OnInfoListener, MediaPlayer$OnErrorListener
{
    protected MediaPlayer a;
    Surface b;
    private float c;
    private int d;
    private String e;
    private boolean f;
    private boolean g;
    private int h;
    private boolean i;
    
    public IllustrationVideoView(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = 1.0f;
        this.d = 0;
        this.g = true;
        this.h = 0;
        this.i = false;
        if (!this.isInEditMode()) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aedq.k);
            final int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (aeda.t()) {
                this.g = obtainStyledAttributes.getBoolean(0, true);
            }
            obtainStyledAttributes.recycle();
            final String packageName = this.getContext().getPackageName();
            if (resourceId != this.d || (packageName != null && !packageName.equals(this.e))) {
                this.d = resourceId;
                this.e = packageName;
                this.a();
            }
            this.setScaleX(0.9999999f);
            this.setScaleX(0.9999999f);
            this.setSurfaceTextureListener((TextureView$SurfaceTextureListener)this);
        }
    }
    
    private final void c() {
        if (this.getWindowVisibility() == 0) {
            final Surface b = this.b;
            if (b != null) {
                b.release();
                this.b = null;
            }
            final SurfaceTexture surfaceTexture = this.getSurfaceTexture();
            if (surfaceTexture != null) {
                this.d(true);
                this.b = new Surface(surfaceTexture);
            }
            if (this.b != null) {
                this.a();
            }
        }
    }
    
    private final void d(final boolean i) {
        this.i = i;
        this.setVisibility(this.h);
    }
    
    protected final void a() {
        final MediaPlayer a = this.a;
        if (a != null) {
            a.release();
        }
        if (this.b != null) {
            if (this.d != 0) {
                (this.a = new MediaPlayer()).setSurface(this.b);
                this.a.setOnPreparedListener((MediaPlayer$OnPreparedListener)this);
                this.a.setOnSeekCompleteListener((MediaPlayer$OnSeekCompleteListener)this);
                this.a.setOnInfoListener((MediaPlayer$OnInfoListener)this);
                this.a.setOnErrorListener((MediaPlayer$OnErrorListener)this);
                final int d = this.d;
                final String e = this.e;
                final StringBuilder sb = new StringBuilder("android.resource://");
                sb.append(e);
                sb.append("/");
                sb.append(d);
                final Uri parse = Uri.parse(sb.toString());
                try {
                    this.a.setDataSource(this.getContext(), parse, (Map)null);
                    this.a.prepareAsync();
                }
                catch (final IOException ex) {
                    final StringBuilder sb2 = new StringBuilder("Unable to set video data source: ");
                    sb2.append(d);
                    Log.e("IllustrationVideoView", sb2.toString(), (Throwable)ex);
                }
            }
        }
    }
    
    public final void b() {
        final MediaPlayer a = this.a;
        if (a != null) {
            a.release();
            this.a = null;
            this.f = false;
        }
        final Surface b = this.b;
        if (b != null) {
            b.release();
            this.b = null;
        }
    }
    
    public final boolean isRunning() {
        final MediaPlayer a = this.a;
        return a != null && a.isPlaying();
    }
    
    public final boolean onError(final MediaPlayer mediaPlayer, final int n, final int n2) {
        final StringBuilder sb = new StringBuilder("MediaPlayer error. what=");
        sb.append(n);
        sb.append(" extra=");
        sb.append(n2);
        Log.w("IllustrationVideoView", sb.toString());
        return false;
    }
    
    public final boolean onInfo(final MediaPlayer mediaPlayer, final int n, final int n2) {
        if (n == 3) {
            this.d(false);
        }
        return false;
    }
    
    protected final void onMeasure(int size, int n) {
        final int size2 = View$MeasureSpec.getSize(size);
        size = View$MeasureSpec.getSize(n);
        final float n2 = (float)size;
        final float c = this.c;
        final float n3 = size2 * c;
        if (n2 < n3) {
            n = (int)(n2 / c);
        }
        else {
            size = (int)n3;
            n = size2;
        }
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(n, 1073741824), View$MeasureSpec.makeMeasureSpec(size, 1073741824));
    }
    
    public final void onPrepared(final MediaPlayer mediaPlayer) {
        mediaPlayer.setLooping(this.f = true);
        float c;
        if (mediaPlayer.getVideoWidth() > 0 && mediaPlayer.getVideoHeight() > 0) {
            c = mediaPlayer.getVideoHeight() / (float)mediaPlayer.getVideoWidth();
        }
        else {
            final int videoWidth = mediaPlayer.getVideoWidth();
            final int videoHeight = mediaPlayer.getVideoHeight();
            final StringBuilder sb = new StringBuilder("Unexpected video size=");
            sb.append(videoWidth);
            sb.append("x");
            sb.append(videoHeight);
            Log.w("IllustrationVideoView", sb.toString());
            c = 0.0f;
        }
        if (Float.compare(this.c, c) != 0) {
            this.c = c;
            this.requestLayout();
        }
        if (this.getWindowVisibility() == 0) {
            this.start();
        }
    }
    
    public final void onSeekComplete(final MediaPlayer mediaPlayer) {
        if (this.f) {
            mediaPlayer.start();
            return;
        }
        Log.e("IllustrationVideoView", "Seek complete but media player not prepared");
    }
    
    public final void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        this.d(true);
        this.c();
    }
    
    public final boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
        this.b();
        return true;
    }
    
    public final void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, final int n, final int n2) {
    }
    
    public final void onSurfaceTextureUpdated(final SurfaceTexture surfaceTexture) {
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (b) {
            this.start();
            return;
        }
        this.stop();
    }
    
    protected final void onWindowVisibilityChanged(final int n) {
        super.onWindowVisibilityChanged(n);
        if (n == 0) {
            if (this.b == null) {
                this.c();
            }
            return;
        }
        this.b();
    }
    
    public final void setVisibility(final int h) {
        this.h = h;
        int visibility = h;
        if (this.i && (visibility = h) == 0) {
            visibility = 4;
        }
        super.setVisibility(visibility);
    }
    
    public final void start() {
        if (this.f) {
            final MediaPlayer a = this.a;
            if (a != null && !a.isPlaying()) {
                this.a.start();
            }
        }
    }
    
    public final void stop() {
        if (this.g && this.f) {
            final MediaPlayer a = this.a;
            if (a != null) {
                a.pause();
            }
        }
    }
}
