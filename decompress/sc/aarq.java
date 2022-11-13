import android.hardware.Sensor;
import android.os.Build;
import android.view.WindowManager;
import android.content.Context;
import android.hardware.SensorManager;
import com.google.vr.sdk.base.sensors.internal.Vector3d;
import com.google.vr.sdk.base.sensors.internal.GyroscopeBiasEstimator;
import android.view.Display;
import android.os.Handler;
import android.hardware.SensorEventListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aarq
{
    public final Object a;
    public SensorEventListener b;
    public boolean c;
    public Handler d;
    public float e;
    public float f;
    public float g;
    public int h;
    public float i;
    public boolean j;
    public long k;
    public final float[] l;
    public final Display m;
    public final Object n;
    public final GyroscopeBiasEstimator o;
    public float[] p;
    public final Vector3d q;
    public final Vector3d r;
    public final Vector3d s;
    private final SensorManager t;
    private boolean u;
    
    public aarq(final Context context) {
        this.a = new Object();
        this.l = new float[] { -1.0f, 1.0f };
        this.n = new Object();
        this.q = new Vector3d();
        this.r = new Vector3d();
        this.s = new Vector3d();
        this.t = (SensorManager)context.getSystemService("sensor");
        this.m = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        this.o = new GyroscopeBiasEstimator();
    }
    
    public final void a(final boolean b) {
        monitorenter(this);
        Label_0138: {
            if (!b) {
                break Label_0138;
            }
            try {
                if (!this.u) {
                    final Sensor defaultSensor = this.t.getDefaultSensor(1);
                    final Sensor defaultSensor2 = this.t.getDefaultSensor(9);
                    Sensor sensor = this.t.getDefaultSensor(16);
                    if (sensor == null || Build.MANUFACTURER.equals("HTC")) {
                        sensor = this.t.getDefaultSensor(4);
                    }
                    if (defaultSensor2 != null && sensor != null) {
                        this.t.registerListener(this.b, defaultSensor, 0, this.d);
                        this.t.registerListener(this.b, defaultSensor2, 0, this.d);
                        this.t.registerListener(this.b, sensor, 0, this.d);
                        this.u = true;
                        return;
                    }
                }
                Label_0164: {
                    return;
                }
                iftrue(Label_0164:)(!this.u);
                this.t.unregisterListener(this.b);
                this.u = false;
            }
            finally {
                monitorexit(this);
            }
        }
    }
    
    public final void b() {
        if (!this.c) {
            return;
        }
        this.a(false);
        synchronized (this.a) {
            this.c = false;
            final Handler d = this.d;
            if (d != null) {
                d.post((Runnable)new tjv(9));
            }
            monitorexit(this.a);
            this.d = null;
        }
    }
}
