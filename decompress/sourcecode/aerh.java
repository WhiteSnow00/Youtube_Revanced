// 
// Decompiled by Procyon v0.6.0
// 

public final class aerh extends aeri implements aerg
{
    public static final aeri a;
    
    static {
        a = new aerh(null, new abn(0)).e();
    }
    
    public aerh(final aeri aeri, final abn abn) {
        super(aeri, abn);
    }
    
    public final void a(final afld afld, final Object o) {
        agot.E(super.c ^ true, (Object)"Can't mutate after handing to trace");
        o.getClass();
        agot.E(this.h(afld) ^ true, (Object)"Key already present");
        super.b.put((Object)afld, o);
    }
}
