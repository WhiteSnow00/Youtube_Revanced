// 
// Decompiled by Procyon v0.6.0
// 

public final class acln
{
    public final afbh a;
    public final afbh b;
    public final afbh c;
    
    public acln() {
        final afag a = afag.a;
        this.a = a;
        this.b = a;
        this.c = a;
    }
    
    public acln(final ajoq ajoq) {
        afbh a;
        if (ajoq.c && (ajoq.b & 0x8) != 0x0) {
            a = afbh.k((int)ajoq.f);
        }
        else {
            a = afag.a;
        }
        this.a = a;
        afbh b;
        if ((ajoq.b & 0x4) != 0x0) {
            b = afbh.k(ajoq.e);
        }
        else {
            b = afag.a;
        }
        this.b = b;
        afbh c;
        if ((ajoq.b & 0x2) != 0x0) {
            c = afbh.k(ajoq.d);
        }
        else {
            c = afag.a;
        }
        this.c = c;
    }
}
