import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glo
{
    public int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    
    public glo() {
    }
    
    public glo(final byte[] array) {
        this.a = -1;
    }
    
    public glo(final byte[] array, final byte[] array2) {
    }
    
    public final glp a() {
        final Object b = this.b;
        if (b != null) {
            final Object c = this.c;
            if (c != null) {
                final Object d = this.d;
                if (d != null) {
                    final Object e = this.e;
                    if (e != null) {
                        final int a = this.a;
                        if (a != 0) {
                            return new glp((akfg)b, (akgf)c, (akfu)d, (akge)e, a);
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" inlineAudioControlUIStyle");
        }
        if (this.c == null) {
            sb.append(" inlineScrubbingUIStyle");
        }
        if (this.d == null) {
            sb.append(" inlinePlaybackFullScreenUIStyle");
        }
        if (this.e == null) {
            sb.append(" inlinePlaybackTriggerStyle");
        }
        if (this.a == 0) {
            sb.append(" inlinePlaybackHostContainerStyle");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
    
    public final void b(final akfg b) {
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null inlineAudioControlUIStyle");
    }
    
    public final void c(final akfu d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null inlinePlaybackFullScreenUIStyle");
    }
    
    public final void d(final akge e) {
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("Null inlinePlaybackTriggerStyle");
    }
    
    public final void e(final akgf c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null inlineScrubbingUIStyle");
    }
    
    public final Rect f() {
        final Object d = this.d;
        if (d != null && !((Rect)d).isEmpty()) {
            return (Rect)this.d;
        }
        return null;
    }
    
    public final boolean g() {
        return this.c != null;
    }
}
