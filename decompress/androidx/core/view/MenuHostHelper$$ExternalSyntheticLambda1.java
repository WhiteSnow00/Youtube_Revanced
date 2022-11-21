// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.view;

import java.util.concurrent.CopyOnWriteArrayList;

public final class MenuHostHelper$$ExternalSyntheticLambda1 implements aun
{
    public final alo a;
    public final auj b;
    public final alq c;
    
    public MenuHostHelper$$ExternalSyntheticLambda1(final alo a, final auj b, final alq c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final aup aup, final aui aui) {
        final alo a = this.a;
        final auj b = this.b;
        final alq c = this.c;
        if (aui == aui.c(b)) {
            a.a(c);
            return;
        }
        if (aui == aui.ON_DESTROY) {
            a.d(c);
            return;
        }
        if (aui == aui.a(b)) {
            ((CopyOnWriteArrayList)a.b).remove(c);
            ((Runnable)a.a).run();
        }
    }
}
