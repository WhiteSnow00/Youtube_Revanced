// 
// Decompiled by Procyon v0.6.0
// 

public final class acka
{
    public final aezp a;
    public final aezp b;
    public final aezp c;
    
    public acka() {
        final aeyo a = aeyo.a;
        this.a = (aezp)a;
        this.b = (aezp)a;
        this.c = (aezp)a;
    }
    
    public acka(final ajmr ajmr) {
        Object a;
        if (ajmr.c && (ajmr.b & 0x8) != 0x0) {
            a = aezp.k((Object)(int)ajmr.f);
        }
        else {
            a = aeyo.a;
        }
        this.a = (aezp)a;
        Object b;
        if ((ajmr.b & 0x4) != 0x0) {
            b = aezp.k((Object)ajmr.e);
        }
        else {
            b = aeyo.a;
        }
        this.b = (aezp)b;
        Object c;
        if ((ajmr.b & 0x2) != 0x0) {
            c = aezp.k((Object)ajmr.d);
        }
        else {
            c = aeyo.a;
        }
        this.c = (aezp)c;
    }
}
