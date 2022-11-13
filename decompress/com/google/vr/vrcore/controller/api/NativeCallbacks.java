// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.vrcore.controller.api;

public final class NativeCallbacks implements ControllerServiceBridge$Callbacks
{
    private final long a;
    private boolean b;
    
    public NativeCallbacks(final long a) {
        this.a = a;
    }
    
    private final void a(final ControllerEventPacket controllerEventPacket) {
        final int n = 0;
        int n2 = 0;
        while (!this.b) {
            final int l = controllerEventPacket.l;
            if (n2 >= l) {
                break;
            }
            if (n2 >= l) {
                throw new IndexOutOfBoundsException();
            }
            final ControllerAccelEvent controllerAccelEvent = controllerEventPacket.m[n2];
            this.handleAccelEvent(this.a, controllerAccelEvent.e, controllerAccelEvent.d, controllerAccelEvent.a, controllerAccelEvent.b, controllerAccelEvent.c);
            ++n2;
        }
        for (int n3 = 0; !this.b && n3 < controllerEventPacket.n; ++n3) {
            final ControllerButtonEvent f = controllerEventPacket.f(n3);
            this.handleButtonEvent(this.a, f.e, f.d, f.b, f.c);
        }
        int n4 = 0;
        while (!this.b) {
            final int p = controllerEventPacket.p;
            if (n4 >= p) {
                break;
            }
            if (n4 >= p) {
                throw new IndexOutOfBoundsException();
            }
            final ControllerGyroEvent controllerGyroEvent = controllerEventPacket.q[n4];
            this.handleGyroEvent(this.a, controllerGyroEvent.e, controllerGyroEvent.d, controllerGyroEvent.a, controllerGyroEvent.b, controllerGyroEvent.c);
            ++n4;
        }
        int n5 = 0;
        int n6;
        while (true) {
            n6 = n;
            if (this.b) {
                break;
            }
            final int r = controllerEventPacket.r;
            n6 = n;
            if (n5 >= r) {
                break;
            }
            if (n5 >= r) {
                throw new IndexOutOfBoundsException();
            }
            final ControllerOrientationEvent controllerOrientationEvent = controllerEventPacket.s[n5];
            this.handleOrientationEvent(this.a, controllerOrientationEvent.e, controllerOrientationEvent.d, controllerOrientationEvent.a, controllerOrientationEvent.b, controllerOrientationEvent.c, controllerOrientationEvent.f);
            ++n5;
        }
        while (!this.b) {
            final int t = controllerEventPacket.t;
            if (n6 >= t) {
                break;
            }
            if (n6 >= t) {
                throw new IndexOutOfBoundsException();
            }
            final ControllerTouchEvent controllerTouchEvent = controllerEventPacket.u[n6];
            this.handleTouchEvent(this.a, controllerTouchEvent.e, controllerTouchEvent.d, controllerTouchEvent.b, controllerTouchEvent.c, controllerTouchEvent.f);
            ++n6;
        }
    }
    
    private native void handleAccelEvent(final long p0, final int p1, final long p2, final float p3, final float p4, final float p5);
    
    private native void handleBatteryEvent(final long p0, final int p1, final long p2, final boolean p3, final int p4);
    
    private native void handleButtonEvent(final long p0, final int p1, final long p2, final int p3, final boolean p4);
    
    private native void handleControllerRecentered(final long p0, final int p1, final long p2, final float p3, final float p4, final float p5, final float p6);
    
    private native void handleGyroEvent(final long p0, final int p1, final long p2, final float p3, final float p4, final float p5);
    
    private native void handleOrientationEvent(final long p0, final int p1, final long p2, final float p3, final float p4, final float p5, final float p6);
    
    private native void handlePositionEvent(final long p0, final int p1, final long p2, final float p3, final float p4, final float p5);
    
    private native void handleServiceConnected(final long p0, final int p1);
    
    private native void handleServiceDisconnected(final long p0);
    
    private native void handleServiceFailed(final long p0);
    
    private native void handleServiceInitFailed(final long p0, final int p1);
    
    private native void handleServiceUnavailable(final long p0);
    
    private native void handleStateChanged(final long p0, final int p1, final int p2);
    
    private native void handleTouchEvent(final long p0, final int p1, final long p2, final int p3, final float p4, final float p5);
    
    private native void handleTrackingStatusEvent(final long p0, final int p1, final long p2, final int p3);
    
    public void close() {
        synchronized (this) {
            this.b = true;
        }
    }
    
    @Override
    public final void onControllerEventPacket(final ControllerEventPacket controllerEventPacket) {
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.a(controllerEventPacket);
        }
    }
    
    @Override
    public final void onControllerEventPacket2(final ControllerEventPacket2 controllerEventPacket2) {
        monitorenter(this);
        try {
            if (this.b) {
                monitorexit(this);
                return;
            }
            this.a(controllerEventPacket2);
            final int n = 0;
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (this.b) {
                    break;
                }
                final int c = controllerEventPacket2.c;
                n3 = n;
                if (n2 >= c) {
                    break;
                }
                if (n2 >= c) {
                    throw new IndexOutOfBoundsException();
                }
                final ControllerPositionEvent controllerPositionEvent = controllerEventPacket2.d[n2];
                this.handlePositionEvent(this.a, controllerPositionEvent.e, controllerPositionEvent.d, controllerPositionEvent.a, controllerPositionEvent.b, controllerPositionEvent.c);
                ++n2;
            }
            while (!this.b) {
                final int h = controllerEventPacket2.h;
                if (n3 < h) {
                    if (n3 >= h) {
                        throw new IndexOutOfBoundsException();
                    }
                    final ControllerTrackingStatusEvent controllerTrackingStatusEvent = controllerEventPacket2.i[n3];
                    this.handleTrackingStatusEvent(this.a, controllerTrackingStatusEvent.e, controllerTrackingStatusEvent.d, controllerTrackingStatusEvent.a);
                    ++n3;
                }
                else {
                    if (controllerEventPacket2.e) {
                        final ControllerBatteryEvent f = controllerEventPacket2.f;
                        this.handleBatteryEvent(this.a, f.e, f.d, f.b, f.a);
                        monitorexit(this);
                        return;
                    }
                    break;
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void onControllerRecentered(final ControllerOrientationEvent controllerOrientationEvent) {
        synchronized (this) {
            if (!this.b) {
                this.handleControllerRecentered(this.a, controllerOrientationEvent.e, controllerOrientationEvent.d, controllerOrientationEvent.a, controllerOrientationEvent.b, controllerOrientationEvent.c, controllerOrientationEvent.f);
            }
        }
    }
    
    @Override
    public final void onControllerStateChanged(final int n, final int n2) {
        synchronized (this) {
            if (!this.b) {
                this.handleStateChanged(this.a, n, n2);
            }
        }
    }
    
    @Override
    public final void onServiceConnected(final int n) {
        synchronized (this) {
            if (!this.b) {
                this.handleServiceConnected(this.a, 1);
            }
        }
    }
    
    @Override
    public final void onServiceDisconnected() {
        synchronized (this) {
            if (!this.b) {
                this.handleServiceDisconnected(this.a);
            }
        }
    }
    
    @Override
    public final void onServiceFailed() {
        synchronized (this) {
            if (!this.b) {
                this.handleServiceFailed(this.a);
            }
        }
    }
    
    @Override
    public final void onServiceInitFailed(final int n) {
        synchronized (this) {
            if (!this.b) {
                this.handleServiceInitFailed(this.a, n);
            }
        }
    }
    
    @Override
    public final void onServiceUnavailable() {
        synchronized (this) {
            if (!this.b) {
                this.handleServiceUnavailable(this.a);
            }
        }
    }
}
