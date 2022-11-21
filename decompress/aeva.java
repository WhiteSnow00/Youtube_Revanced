// 
// Decompiled by Procyon v0.6.0
// 

public final class aeva extends aevb implements aeuz
{
    public static final aevb a;
    
    static {
        a = new aeva(null, new abp(0)).e();
    }
    
    public aeva(final aevb aevb, final abp abp) {
        super(aevb, abp);
    }
    
    @Override
    public final void a(final agpx agpx, final Object o) {
        adme.U(super.c ^ true, "Can't mutate after handing to trace");
        o.getClass();
        adme.U(this.h(agpx) ^ true, "Key already present");
        super.b.put((Object)agpx, o);
    }
}
