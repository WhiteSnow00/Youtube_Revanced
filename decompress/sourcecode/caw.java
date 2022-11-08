import java.util.Collection;
import java.util.Iterator;
import android.database.Cursor;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.Closeable;
import android.view.View;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class caw
{
    public static void a(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter, final int n) {
        context.registerReceiver(broadcastReceiver, intentFilter, n);
    }
    
    public static int b(final Context context) {
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        final int widthPixels = displayMetrics.widthPixels;
        final int heightPixels = displayMetrics.heightPixels;
        final TypedValue typedValue = new TypedValue();
        final Resources resources = context.getResources();
        int n;
        if (widthPixels < heightPixels) {
            n = 2131167996;
        }
        else {
            n = 2131167995;
        }
        resources.getValue(n, typedValue, true);
        float n2;
        if (typedValue.type == 5) {
            n2 = typedValue.getDimension(displayMetrics);
        }
        else {
            if (typedValue.type != 6) {
                return -2;
            }
            n2 = typedValue.getFraction((float)displayMetrics.widthPixels, (float)displayMetrics.widthPixels);
        }
        return (int)n2;
    }
    
    public static final void c(final View view, final cgj cgj) {
        view.getClass();
        view.setTag(2131432372, (Object)cgj);
    }
    
    public static final cgd d(cgl cgl, final String s) {
        final cgl cgl2 = cgl;
        final StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(s);
        final String s2 = "`)";
        sb.append("`)");
        Object b = cgl2.b(sb.toString());
        try {
            final int columnCount = ((Cursor)b).getColumnCount();
            final String s3 = "name";
            Map a;
            if (columnCount <= 0) {
                a = atki.a;
                atzz.c((Closeable)b, (Throwable)null);
            }
            else {
                final int columnIndex = ((Cursor)b).getColumnIndex("name");
                final int columnIndex2 = ((Cursor)b).getColumnIndex("type");
                final int columnIndex3 = ((Cursor)b).getColumnIndex("notnull");
                final int columnIndex4 = ((Cursor)b).getColumnIndex("pk");
                final int columnIndex5 = ((Cursor)b).getColumnIndex("dflt_value");
                a = new atks();
                while (((Cursor)b).moveToNext()) {
                    final String string = ((Cursor)b).getString(columnIndex);
                    final String string2 = ((Cursor)b).getString(columnIndex2);
                    final boolean b2 = ((Cursor)b).getInt(columnIndex3) != 0;
                    final int int1 = ((Cursor)b).getInt(columnIndex4);
                    final String string3 = ((Cursor)b).getString(columnIndex5);
                    string.getClass();
                    string2.getClass();
                    a.put(string, new cfz(string, string2, b2, int1, string3, 2));
                }
                ((atks)a).k();
                atzz.c((Closeable)b, (Throwable)null);
            }
            b = new StringBuilder("PRAGMA foreign_key_list(`");
            ((StringBuilder)b).append(s);
            ((StringBuilder)b).append("`)");
            Cursor cursor = cgl2.b(((StringBuilder)b).toString());
            try {
                final int columnIndex6 = cursor.getColumnIndex("id");
                final int columnIndex7 = cursor.getColumnIndex("seq");
                final int columnIndex8 = cursor.getColumnIndex("table");
                final int columnIndex9 = cursor.getColumnIndex("on_delete");
                final int columnIndex10 = cursor.getColumnIndex("on_update");
                final int columnIndex11 = cursor.getColumnIndex("id");
                final int columnIndex12 = cursor.getColumnIndex("seq");
                final int columnIndex13 = cursor.getColumnIndex("from");
                final int columnIndex14 = cursor.getColumnIndex("to");
                final List e = aqzg.E();
                b = a;
                while (cursor.moveToNext()) {
                    final int int2 = cursor.getInt(columnIndex11);
                    final int int3 = cursor.getInt(columnIndex12);
                    final String string4 = cursor.getString(columnIndex13);
                    string4.getClass();
                    final String string5 = cursor.getString(columnIndex14);
                    string5.getClass();
                    e.add(new cgb(int2, int3, string4, string5));
                }
                aqzg.P(e);
                List list;
                if (((atkn)e).c <= 1) {
                    list = aqzg.I((Iterable)e);
                }
                else {
                    final Object[] array = e.toArray(new Comparable[0]);
                    array.getClass();
                    final Object[] array2 = array;
                    if (array2.length > 1) {
                        Arrays.sort(array2);
                    }
                    list = aqqn.w(array2);
                }
                cursor.moveToPosition(-1);
                final Set f = atva.f();
                while (cursor.moveToNext()) {
                    if (cursor.getInt(columnIndex7) == 0) {
                        final int int4 = cursor.getInt(columnIndex6);
                        final ArrayList list2 = new ArrayList();
                        final ArrayList list3 = new ArrayList();
                        final ArrayList list4 = new ArrayList();
                        for (final Object next : list) {
                            if (((cgb)next).a == int4) {
                                list4.add(next);
                            }
                        }
                        for (final cgb cgb : list4) {
                            list2.add(cgb.b);
                            list3.add(cgb.c);
                        }
                        final String string6 = cursor.getString(columnIndex8);
                        string6.getClass();
                        final String string7 = cursor.getString(columnIndex9);
                        string7.getClass();
                        final String string8 = cursor.getString(columnIndex10);
                        string8.getClass();
                        f.add(new cga(string6, string7, string8, (List)list2, (List)list3));
                    }
                }
                atva.i(f);
                atzz.c((Closeable)cursor, (Throwable)null);
                final StringBuilder sb2 = new StringBuilder("PRAGMA index_list(`");
                sb2.append(s);
                sb2.append("`)");
                cursor = cgl2.b(sb2.toString());
                final String s4 = s3;
                try {
                    final int columnIndex15 = cursor.getColumnIndex(s4);
                    final int columnIndex16 = cursor.getColumnIndex("origin");
                    final int columnIndex17 = cursor.getColumnIndex("unique");
                    if (columnIndex15 != -1 && columnIndex16 != -1 && columnIndex17 != -1) {
                        final Set<Object> f2 = atva.f();
                        final String s5 = s2;
                        while (cursor.moveToNext()) {
                            if (atnh.c("c", cursor.getString(columnIndex16))) {
                                final String string9 = cursor.getString(columnIndex15);
                                final boolean b3 = cursor.getInt(columnIndex17) == 1;
                                string9.getClass();
                                final StringBuilder sb3 = new StringBuilder();
                                sb3.append("PRAGMA index_xinfo(`");
                                sb3.append(string9);
                                sb3.append(s5);
                                final Cursor b4 = cgl.b(sb3.toString());
                                try {
                                    final int columnIndex18 = b4.getColumnIndex("seqno");
                                    final int columnIndex19 = b4.getColumnIndex("cid");
                                    final int columnIndex20 = b4.getColumnIndex(s4);
                                    final int columnIndex21 = b4.getColumnIndex("desc");
                                    Object o;
                                    if (columnIndex18 != -1 && columnIndex19 != -1 && columnIndex20 != -1 && columnIndex21 != -1) {
                                        final TreeMap treeMap = new TreeMap();
                                        final TreeMap treeMap2 = new TreeMap();
                                        while (b4.moveToNext()) {
                                            if (b4.getInt(columnIndex19) >= 0) {
                                                final int int5 = b4.getInt(columnIndex18);
                                                final String string10 = b4.getString(columnIndex20);
                                                String s6;
                                                if (b4.getInt(columnIndex21) > 0) {
                                                    s6 = "DESC";
                                                }
                                                else {
                                                    s6 = "ASC";
                                                }
                                                final Integer value = int5;
                                                string10.getClass();
                                                treeMap.put(value, string10);
                                                treeMap2.put(value, s6);
                                            }
                                        }
                                        final Collection values = treeMap.values();
                                        values.getClass();
                                        final List i = aqzg.I((Iterable)values);
                                        final Collection values2 = treeMap2.values();
                                        values2.getClass();
                                        o = new cgc(string9, b3, i, aqzg.I((Iterable)values2));
                                        atzz.c((Closeable)b4, (Throwable)null);
                                    }
                                    else {
                                        atzz.c((Closeable)b4, (Throwable)null);
                                        o = null;
                                    }
                                    if (o == null) {
                                        atzz.c((Closeable)cursor, (Throwable)null);
                                        return new cgd(s, (Map)b, f, (Set)cgl);
                                    }
                                    f2.add(o);
                                }
                                finally {
                                    try {}
                                    finally {
                                        atzz.c((Closeable)b4, (Throwable)s);
                                    }
                                }
                            }
                        }
                        atva.i((Set)f2);
                        atzz.c((Closeable)cursor, (Throwable)null);
                        cgl = (cgl)f2;
                    }
                    else {
                        atzz.c((Closeable)cursor, (Throwable)null);
                        cgl = null;
                    }
                    return new cgd(s, (Map)b, f, (Set)cgl);
                }
                finally {
                    try {}
                    finally {
                        atzz.c((Closeable)cursor, (Throwable)cgl);
                    }
                }
            }
            finally {
                try {}
                finally {
                    atzz.c((Closeable)cursor, (Throwable)cgl);
                }
            }
        }
        finally {
            try {}
            finally {
                atzz.c((Closeable)b, (Throwable)s);
                while (true) {}
            }
        }
    }
}
