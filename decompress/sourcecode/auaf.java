import java.util.concurrent.atomic.AtomicReference;
import android.os.Handler;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auaf
{
    public static Context a;
    
    public static Intent a(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
        return context.registerReceiver(broadcastReceiver, intentFilter, (String)null, (Handler)null, 4);
    }
    
    public static final Class c(final atob atob) {
        atob.getClass();
        return ((atna)atob).a();
    }
    
    public static final Class d(final atob atob) {
        atob.getClass();
        final Class a = ((atna)atob).a();
        if (!a.isPrimitive()) {
            return a;
        }
        final String name = a.getName();
        Class<Double> clazz = a;
        if (name != null) {
            switch (name.hashCode()) {
                default: {
                    clazz = a;
                    break;
                }
                case 109413500: {
                    clazz = a;
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
                }
                case 97526364: {
                    clazz = a;
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                }
                case 64711720: {
                    clazz = a;
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                }
                case 3625364: {
                    clazz = a;
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                }
                case 3327612: {
                    clazz = a;
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                }
                case 3052374: {
                    clazz = a;
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                }
                case 3039496: {
                    clazz = a;
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                }
                case 104431: {
                    clazz = a;
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                }
                case -1325958191: {
                    clazz = a;
                    if (name.equals("double")) {
                        clazz = Double.class;
                        break;
                    }
                    break;
                }
            }
        }
        return clazz;
    }
}
