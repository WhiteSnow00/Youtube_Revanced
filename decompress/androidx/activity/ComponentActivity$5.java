// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity;

public class ComponentActivity$5 implements aun
{
    final qu a;
    
    public ComponentActivity$5(final qu a) {
        this.a = a;
    }
    
    public final void a(final aup aup, final aui aui) {
        this.a.ensureViewModelStore();
        ((dh)this.a).getLifecycle().c((auo)this);
    }
}
