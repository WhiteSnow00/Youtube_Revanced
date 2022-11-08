import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

class gfg
{
    public static final int[] a;
    public static final int[] b;
    protected final boolean c;
    protected final View d;
    
    static {
        a = new int[] { 2132017291, 2132017418, 2131886086, 2131886090 };
        b = new int[] { 2132017243, 2132017417, 2131886080, 2131886089 };
    }
    
    public gfg(final View d, final boolean c) {
        this.d = d;
        this.c = c;
    }
    
    public final void a(final CharSequence contentDescription) {
        this.d.setContentDescription(contentDescription);
    }
    
    public void b(final boolean enabled) {
        this.d.setEnabled(enabled);
        final View d = this.d;
        float alpha;
        if (!enabled) {
            alpha = 0.2f;
        }
        else {
            alpha = 1.0f;
        }
        d.setAlpha(alpha);
    }
    
    public final void c(final int visibility) {
        this.d.setVisibility(visibility);
    }
    
    public final boolean d(final almd almd) {
        final boolean b = !this.c && almd == almd.a;
        final boolean b2 = this.c && almd == almd.b;
        return b || b2;
    }
    
    protected void e(final almd almd, final agzc agzc) {
        if (agzc != null) {
            if (!agzc.rs((agyr)allw.b) || !(boolean)agzc.rr((agyr)allw.b)) {
                agzc.e((agyr)allw.b, true);
            }
            agzc.e((agyr)allw.c, almd);
        }
        final almd a = almd.a;
        final int ordinal = almd.ordinal();
        if (ordinal == 0) {
            this.d.setSelected(this.c ^ true);
            return;
        }
        if (ordinal == 1) {
            this.d.setSelected(this.c);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        this.d.setSelected(false);
    }
}
