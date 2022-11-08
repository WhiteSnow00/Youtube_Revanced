// 
// Decompiled by Procyon v0.6.0
// 

final class afre extends afqw
{
    public afre() {
    }
    
    public final afra a(final afrl afrl, final afra listeners) {
        synchronized (afrl) {
            final afra listeners2 = afrl.listeners;
            if (listeners2 != listeners) {
                afrl.listeners = listeners;
            }
            return listeners2;
        }
    }
    
    public final afrk b(final afrl afrl, final afrk waiters) {
        synchronized (afrl) {
            final afrk waiters2 = afrl.waiters;
            if (waiters2 != waiters) {
                afrl.waiters = waiters;
            }
            return waiters2;
        }
    }
    
    public final void c(final afrk afrk, final afrk next) {
        afrk.next = next;
    }
    
    public final void d(final afrk afrk, final Thread thread) {
        afrk.thread = thread;
    }
    
    public final boolean e(final afrl afrl, final afra afra, final afra listeners) {
        synchronized (afrl) {
            if (afrl.listeners == afra) {
                afrl.listeners = listeners;
                return true;
            }
            return false;
        }
    }
    
    public final boolean f(final afrl afrl, final Object o, final Object value) {
        synchronized (afrl) {
            if (afrl.value == o) {
                afrl.value = value;
                return true;
            }
            return false;
        }
    }
    
    public final boolean g(final afrl afrl, final afrk afrk, final afrk waiters) {
        synchronized (afrl) {
            if (afrl.waiters == afrk) {
                afrl.waiters = waiters;
                return true;
            }
            return false;
        }
    }
}
