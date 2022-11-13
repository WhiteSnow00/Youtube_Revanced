// 
// Decompiled by Procyon v0.6.0
// 

public final class ftm
{
    public final acke a;
    public acjn b;
    public acjn c;
    private final acjn d;
    private Object e;
    
    public ftm() {
        final acke a = new acke();
        this.a = a;
        final acle d = new acle();
        this.d = (acjn)d;
        this.b = (acjn)new acle();
        this.c = (acjn)new acle();
        a.m((acjn)d);
        a.m(this.c);
        a.m(this.b);
    }
    
    public final int a(final int n) {
        return n + ((tfz)this.d).size();
    }
    
    public final void b(final acjn acjn) {
        if (this.c == acjn) {
            return;
        }
        Object c;
        if ((c = acjn) == null) {
            c = new acle();
        }
        this.a.r(this.c, (acjn)c);
        this.c = (acjn)c;
    }
    
    public final void c(final Object e) {
        if (e == this.e) {
            return;
        }
        this.e = e;
        final acle b = new acle();
        if (e != null) {
            ((tfz)b).add(0, e);
        }
        this.a.r(this.b, (acjn)b);
        this.b = (acjn)b;
    }
}
