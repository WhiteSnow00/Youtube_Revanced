// 
// Decompiled by Procyon v0.6.0
// 

final class bpy extends bxm
{
    final bqa a;
    
    public bpy(final bqa a) {
        this.a = a;
    }
    
    public final void release() {
        final bqa a = this.a;
        dk.h(a.a.size() < 2);
        dk.f(a.a.contains(this) ^ true);
        ((bcw)this).clear();
        a.a.addFirst(this);
    }
}
