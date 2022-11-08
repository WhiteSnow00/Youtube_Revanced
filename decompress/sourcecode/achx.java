// 
// Decompiled by Procyon v0.6.0
// 

public final class achx
{
    public final aexq a;
    public final aexq b;
    public final aexq c;
    
    public achx() {
        final aewp a = aewp.a;
        this.a = (aexq)a;
        this.b = (aexq)a;
        this.c = (aexq)a;
    }
    
    public achx(final ajkm ajkm) {
        Object a;
        if (ajkm.c && (ajkm.b & 0x8) != 0x0) {
            a = aexq.k((int)ajkm.f);
        }
        else {
            a = aewp.a;
        }
        this.a = (aexq)a;
        Object b;
        if ((ajkm.b & 0x4) != 0x0) {
            b = aexq.k(ajkm.e);
        }
        else {
            b = aewp.a;
        }
        this.b = (aexq)b;
        Object c;
        if ((ajkm.b & 0x2) != 0x0) {
            c = aexq.k(ajkm.d);
        }
        else {
            c = aewp.a;
        }
        this.c = (aexq)c;
    }
}
