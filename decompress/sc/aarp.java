import com.google.vr.sdk.base.sensors.internal.Vector3d;
import android.hardware.SensorEvent;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class aarp implements SensorEventListener
{
    final aarq a;
    
    public aarp(final aarq a) {
        this.a = a;
    }
    
    public final void onAccuracyChanged(final Sensor sensor, final int n) {
    }
    
    public final void onSensorChanged(final SensorEvent sensorEvent) {
        final aarq a = this.a;
        if (sensorEvent.sensor.getType() == 1) {
            a.q.set((double)sensorEvent.values[0], (double)sensorEvent.values[1], (double)sensorEvent.values[2]);
            synchronized (a.n) {
                a.o.processAccelerometer(a.q, sensorEvent.timestamp);
                return;
            }
        }
        if (sensorEvent.sensor.getType() != 4 && sensorEvent.sensor.getType() != 16) {
            if (sensorEvent.sensor.getType() == 9) {
                final float n = sensorEvent.values[0];
                final float n2 = sensorEvent.values[1];
                final float n3 = sensorEvent.values[2];
                a.h = ((Math.abs(n) <= Math.abs(n2)) ? 1 : 0);
                final int rotation = a.m.getRotation();
                float n4;
                if (rotation != 0 && rotation != 2) {
                    if (rotation == 1) {
                        n4 = 1.5707964f;
                    }
                    else {
                        n4 = -1.5707964f;
                    }
                }
                else {
                    n4 = 0.0f;
                }
                a.g = n4 + (float)Math.atan2(-n, n2);
                float i;
                if (a.h == 0) {
                    if (n < 0.0f) {
                        i = a.l[1];
                    }
                    else {
                        i = a.l[0];
                    }
                }
                else if (n2 > 0.0f) {
                    i = a.l[0];
                }
                else {
                    i = a.l[1];
                }
                a.i = i;
                a.e = n3 * 1.5707964f / 9.80665f;
            }
            return;
        }
        if (sensorEvent.sensor.getType() == 16) {
            if (a.p == null && sensorEvent.values.length == 6) {
                a.p = new float[] { sensorEvent.values[3], sensorEvent.values[4], sensorEvent.values[5] };
            }
            if (a.p != null) {
                a.r.set((double)(sensorEvent.values[0] - a.p[0]), (double)(sensorEvent.values[1] - a.p[1]), (double)(sensorEvent.values[2] - a.p[2]));
            }
            else {
                a.r.set((double)sensorEvent.values[0], (double)sensorEvent.values[1], (double)sensorEvent.values[2]);
            }
        }
        else {
            a.r.set((double)sensorEvent.values[0], (double)sensorEvent.values[1], (double)sensorEvent.values[2]);
        }
        synchronized (a.n) {
            a.o.processGyroscope(a.r, sensorEvent.timestamp);
            a.o.getGyroBias(a.s);
            final Vector3d r = a.r;
            Vector3d.sub(r, a.s, r);
            monitorexit(a.n);
            if (a.k != -1L) {
                double n5;
                if (a.h == 0) {
                    n5 = a.r.x;
                }
                else {
                    n5 = a.r.y;
                }
                final long timestamp = sensorEvent.timestamp;
                final long k = a.k;
                final float f = a.f;
                final float j = a.i;
                final float n6 = (float)(timestamp - k);
                final double n7 = (float)n5;
                final double n8 = n6 * 1.0E-9f;
                Double.isNaN(n7);
                Double.isNaN(n8);
                a.f = f + j * aeuz.j((float)(n7 * n8), -0.1f, 0.1f);
            }
            a.k = sensorEvent.timestamp;
        }
    }
}
