// 
// Decompiled by Procyon v0.6.0
// 

public final class euu
{
    public boolean a;
    public boolean b;
    public boolean c;
    public abid d;
    public boolean e;
    public int f;
    
    public euu() {
        this.d = abid.a;
        this.f = 1;
    }
    
    public final void a() {
        final abid a = abid.a;
        final int ordinal = this.d.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                this.f = 1;
                return;
            }
            if (!this.a) {
                this.f = 1;
                return;
            }
            if (this.f == 1) {
                this.f = 3;
            }
        }
        else {
            if (!this.b || !this.c) {
                this.f = 1;
                return;
            }
            if (this.f == 1) {
                this.f = 3;
            }
        }
    }
}
