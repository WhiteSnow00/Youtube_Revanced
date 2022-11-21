// 
// Decompiled by Procyon v0.6.0
// 

public final class adp
{
    public final boolean a;
    final String b;
    public int c;
    public float d;
    public String e;
    public boolean f;
    public int g;
    public final int h;
    
    public adp(final adp adp, final Object o) {
        this.a = false;
        this.b = adp.b;
        this.h = adp.h;
        this.a(o);
    }
    
    public adp(final String b, final int h, final Object o, final boolean a) {
        this.b = b;
        this.h = h;
        this.a = a;
        this.a(o);
    }
    
    public final void a(final Object o) {
        final int h = this.h;
        if (h == 0) {
            throw null;
        }
        switch (h - 1) {
            default: {
                return;
            }
            case 6: {
                this.d = (float)o;
                return;
            }
            case 5: {
                this.f = (boolean)o;
                return;
            }
            case 4: {
                this.e = (String)o;
                return;
            }
            case 2:
            case 3: {
                this.g = (int)o;
                return;
            }
            case 1: {
                this.d = (float)o;
                return;
            }
            case 0:
            case 7: {
                this.c = (int)o;
            }
        }
    }
}
