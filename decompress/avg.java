import java.util.Set;
import java.util.Iterator;
import android.util.SizeF;
import android.util.Size;
import android.os.IBinder;
import java.io.Serializable;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.LinkedHashMap;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avg implements cgh
{
    public final avi a;
    
    public avg(final avi a) {
        this.a = a;
    }
    
    @Override
    public final Bundle a() {
        final avi a = this.a;
        final Map c = a.c;
        final int size = c.size();
        Object o;
        if (size != 0) {
            if (size != 1) {
                o = new LinkedHashMap(c);
            }
            else {
                final Map.Entry<K, V> entry = c.entrySet().iterator().next();
                o = Collections.singletonMap((Object)entry.getKey(), entry.getValue());
                ((LinkedHashMap)o).getClass();
            }
        }
        else {
            o = atld.a;
        }
        final Iterator iterator = ((Map)o).entrySet().iterator();
        while (true) {
            final boolean hasNext = iterator.hasNext();
            auv auv = null;
            final int n = 0;
            int i = 0;
            if (!hasNext) {
                final Set keySet = a.b.keySet();
                final ArrayList list = new ArrayList(keySet.size());
                final ArrayList list2 = new ArrayList<Object>(list.size());
                for (final String s : keySet) {
                    list.add((Object)s);
                    list2.add(a.b.get(s));
                }
                final atkk k = arva.k((Object)"keys", (Object)list);
                final atkk j = arva.k((Object)"values", (Object)list2);
                final Bundle bundle = new Bundle(2);
                for (int l = n; l < 2; ++l) {
                    final atkk atkk = (new atkk[] { k, j })[l];
                    final String s2 = (String)atkk.a;
                    final Object b = atkk.b;
                    if (b == null) {
                        bundle.putString(s2, (String)null);
                    }
                    else if (b instanceof Boolean) {
                        bundle.putBoolean(s2, (boolean)b);
                    }
                    else if (b instanceof Byte) {
                        bundle.putByte(s2, ((Number)b).byteValue());
                    }
                    else if (b instanceof Character) {
                        bundle.putChar(s2, (char)b);
                    }
                    else if (b instanceof Double) {
                        bundle.putDouble(s2, ((Number)b).doubleValue());
                    }
                    else if (b instanceof Float) {
                        bundle.putFloat(s2, ((Number)b).floatValue());
                    }
                    else if (b instanceof Integer) {
                        bundle.putInt(s2, ((Number)b).intValue());
                    }
                    else if (b instanceof Long) {
                        bundle.putLong(s2, ((Number)b).longValue());
                    }
                    else if (b instanceof Short) {
                        bundle.putShort(s2, ((Number)b).shortValue());
                    }
                    else if (b instanceof Bundle) {
                        bundle.putBundle(s2, (Bundle)b);
                    }
                    else if (b instanceof CharSequence) {
                        bundle.putCharSequence(s2, (CharSequence)b);
                    }
                    else if (b instanceof Parcelable) {
                        bundle.putParcelable(s2, (Parcelable)b);
                    }
                    else if (b instanceof boolean[]) {
                        bundle.putBooleanArray(s2, (boolean[])b);
                    }
                    else if (b instanceof byte[]) {
                        bundle.putByteArray(s2, (byte[])b);
                    }
                    else if (b instanceof char[]) {
                        bundle.putCharArray(s2, (char[])b);
                    }
                    else if (b instanceof double[]) {
                        bundle.putDoubleArray(s2, (double[])b);
                    }
                    else if (b instanceof float[]) {
                        bundle.putFloatArray(s2, (float[])b);
                    }
                    else if (b instanceof int[]) {
                        bundle.putIntArray(s2, (int[])b);
                    }
                    else if (b instanceof long[]) {
                        bundle.putLongArray(s2, (long[])b);
                    }
                    else if (b instanceof short[]) {
                        bundle.putShortArray(s2, (short[])b);
                    }
                    else if (b instanceof Object[]) {
                        final Class<?> componentType = ((short[])b).getClass().getComponentType();
                        componentType.getClass();
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(s2, (Parcelable[])b);
                        }
                        else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(s2, (String[])b);
                        }
                        else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(s2, (CharSequence[])b);
                        }
                        else {
                            if (!Serializable.class.isAssignableFrom(componentType)) {
                                final String canonicalName = componentType.getCanonicalName();
                                final StringBuilder sb = new StringBuilder("Illegal value array type ");
                                sb.append(canonicalName);
                                sb.append(" for key \"");
                                sb.append(s2);
                                sb.append('\"');
                                throw new IllegalArgumentException(sb.toString());
                            }
                            bundle.putSerializable(s2, (Serializable)b);
                        }
                    }
                    else if (b instanceof Serializable) {
                        bundle.putSerializable(s2, (Serializable)b);
                    }
                    else if (b instanceof IBinder) {
                        ajh.a(bundle, s2, (IBinder)b);
                    }
                    else if (b instanceof Size) {
                        aji.a(bundle, s2, (Size)b);
                    }
                    else {
                        if (!(b instanceof SizeF)) {
                            final String canonicalName2 = ((SizeF)b).getClass().getCanonicalName();
                            final StringBuilder sb2 = new StringBuilder("Illegal value type ");
                            sb2.append(canonicalName2);
                            sb2.append(" for key \"");
                            sb2.append(s2);
                            sb2.append('\"');
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        aji.b(bundle, s2, (SizeF)b);
                    }
                }
                return bundle;
            }
            final Map.Entry<String, V> entry2 = (Map.Entry<String, V>)iterator.next();
            final String s3 = entry2.getKey();
            final Bundle a2 = ((cgh)entry2.getValue()).a();
            s3.getClass();
            Label_0226: {
                if (a2 != null) {
                    final Class[] a3 = avi.a;
                    while (i < 29) {
                        final Class clazz = a3[i];
                        clazz.getClass();
                        if (clazz.isInstance(a2)) {
                            break Label_0226;
                        }
                        ++i;
                    }
                    final StringBuilder sb3 = new StringBuilder("Can't put value with type ");
                    sb3.append(a2.getClass());
                    sb3.append(" into saved state");
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
            final Object value = a.d.get(s3);
            if (value instanceof auy) {
                auv = (auy)value;
            }
            if (auv != null) {
                auv.m((Object)a2);
            }
            else {
                a.b.put(s3, a2);
            }
            final atup atup = a.e.get(s3);
            if (atup == null) {
                continue;
            }
            atup.b();
        }
    }
}
