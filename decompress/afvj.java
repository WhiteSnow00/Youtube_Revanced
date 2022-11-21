// 
// Decompiled by Procyon v0.6.0
// 

public final class afvj implements Runnable
{
    public final afvk a;
    public final affy b;
    
    public afvj(final afvk a, final affy b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.a.f(this.b);
    }
}
