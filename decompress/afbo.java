// 
// Decompiled by Procyon v0.6.0
// 

final class afbo extends ThreadLocal
{
    public afbo() {
    }
    
    @Override
    protected final Object initialValue() {
        return afbr.a();
    }
}
