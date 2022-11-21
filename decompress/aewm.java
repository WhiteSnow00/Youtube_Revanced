// 
// Decompiled by Procyon v0.6.0
// 

final class aewm extends ThreadLocal
{
    public aewm() {
    }
    
    @Override
    protected final /* bridge */ Object initialValue() {
        final aewo aewo = new aewo(qem.v());
        final Thread currentThread = Thread.currentThread();
        synchronized (aewp.a) {
            aewp.a.put(currentThread, aewo);
            return aewo;
        }
    }
}
