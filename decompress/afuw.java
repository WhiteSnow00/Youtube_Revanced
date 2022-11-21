// 
// Decompiled by Procyon v0.6.0
// 

final class afuw extends afuo
{
    public afuw() {
    }
    
    @Override
    public final afus a(final afvd afvd, final afus listeners) {
        synchronized (afvd) {
            final afus listeners2 = afvd.listeners;
            if (listeners2 != listeners) {
                afvd.listeners = listeners;
            }
            return listeners2;
        }
    }
    
    @Override
    public final afvc b(final afvd afvd, final afvc waiters) {
        synchronized (afvd) {
            final afvc waiters2 = afvd.waiters;
            if (waiters2 != waiters) {
                afvd.waiters = waiters;
            }
            return waiters2;
        }
    }
    
    @Override
    public final void c(final afvc afvc, final afvc next) {
        afvc.next = next;
    }
    
    @Override
    public final void d(final afvc afvc, final Thread thread) {
        afvc.thread = thread;
    }
    
    @Override
    public final boolean e(final afvd afvd, final afus afus, final afus listeners) {
        synchronized (afvd) {
            if (afvd.listeners == afus) {
                afvd.listeners = listeners;
                return true;
            }
            return false;
        }
    }
    
    @Override
    public final boolean f(final afvd afvd, final Object o, final Object value) {
        synchronized (afvd) {
            if (afvd.value == o) {
                afvd.value = value;
                return true;
            }
            return false;
        }
    }
    
    @Override
    public final boolean g(final afvd afvd, final afvc afvc, final afvc waiters) {
        synchronized (afvd) {
            if (afvd.waiters == afvc) {
                afvd.waiters = waiters;
                return true;
            }
            return false;
        }
    }
}
