// 
// Decompiled by Procyon v0.6.0
// 

final class afcf extends ThreadLocal
{
    public afcf() {
    }
    
    @Override
    protected final /* bridge */ Object initialValue() {
        return new char[1024];
    }
}
