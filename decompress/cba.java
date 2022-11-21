import java.util.Collection;
import android.database.Cursor;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.Closeable;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cba
{
    public static void a(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter, final int n) {
        context.registerReceiver(broadcastReceiver, intentFilter, n);
    }
    
    public static boolean b(final btn btn) {
        final bat bat = new bat(8);
        final int b = yrd.e(btn, bat).b;
        if (b != 1380533830 && b != 1380333108) {
            return false;
        }
        btn.j(bat.a, 0, 4);
        bat.G(0);
        final int d = bat.d();
        if (d != 1463899717) {
            final StringBuilder sb = new StringBuilder("Unsupported form type: ");
            sb.append(d);
            baq.a("WavHeaderReader", sb.toString());
            return false;
        }
        return true;
    }
    
    public static final cgh c(cgp cgp, final String s) {
        final StringBuilder sb = new StringBuilder("PRAGMA table_info(`");
        sb.append(s);
        final String s2 = "`)";
        sb.append("`)");
        Object b = cgp.b(sb.toString());
        try {
            final int columnCount = ((Cursor)b).getColumnCount();
            final String s3 = "name";
            Object a;
            if (columnCount <= 0) {
                a = atoa.a;
                auek.c((Closeable)b, null);
            }
            else {
                final int columnIndex = ((Cursor)b).getColumnIndex("name");
                final int columnIndex2 = ((Cursor)b).getColumnIndex("type");
                final int columnIndex3 = ((Cursor)b).getColumnIndex("notnull");
                final int columnIndex4 = ((Cursor)b).getColumnIndex("pk");
                final int columnIndex5 = ((Cursor)b).getColumnIndex("dflt_value");
                a = new atok();
                while (((Cursor)b).moveToNext()) {
                    final String string = ((Cursor)b).getString(columnIndex);
                    final String string2 = ((Cursor)b).getString(columnIndex2);
                    final boolean b2 = ((Cursor)b).getInt(columnIndex3) != 0;
                    final int int1 = ((Cursor)b).getInt(columnIndex4);
                    final String string3 = ((Cursor)b).getString(columnIndex5);
                    string.getClass();
                    string2.getClass();
                    ((Map<String, cgd>)a).put(string, new cgd(string, string2, b2, int1, string3, 2));
                }
                ((atok)a).k();
                auek.c((Closeable)b, null);
            }
            b = new StringBuilder("PRAGMA foreign_key_list(`");
            ((StringBuilder)b).append(s);
            ((StringBuilder)b).append("`)");
            Object o = cgp.b(((StringBuilder)b).toString());
            try {
                final int columnIndex6 = ((Cursor)o).getColumnIndex("id");
                final int columnIndex7 = ((Cursor)o).getColumnIndex("seq");
                final int columnIndex8 = ((Cursor)o).getColumnIndex("table");
                final int columnIndex9 = ((Cursor)o).getColumnIndex("on_delete");
                final int columnIndex10 = ((Cursor)o).getColumnIndex("on_update");
                final int columnIndex11 = ((Cursor)o).getColumnIndex("id");
                final int columnIndex12 = ((Cursor)o).getColumnIndex("seq");
                final int columnIndex13 = ((Cursor)o).getColumnIndex("from");
                final int columnIndex14 = ((Cursor)o).getColumnIndex("to");
                final List e = atzd.e();
                b = a;
                while (((Cursor)o).moveToNext()) {
                    final int int2 = ((Cursor)o).getInt(columnIndex11);
                    final int int3 = ((Cursor)o).getInt(columnIndex12);
                    final String string4 = ((Cursor)o).getString(columnIndex13);
                    string4.getClass();
                    final String string5 = ((Cursor)o).getString(columnIndex14);
                    string5.getClass();
                    e.add(new cgf(int2, int3, string4, string5));
                }
                atzd.p(e);
                List list;
                if (((atof)e).c <= 1) {
                    list = atzd.i((Iterable)e);
                }
                else {
                    final Object[] array = e.toArray(new Comparable[0]);
                    array.getClass();
                    final Comparable[] array2 = (Comparable[])array;
                    if (array2.length > 1) {
                        Arrays.sort(array2);
                    }
                    list = atyb.e((Object[])array2);
                }
                ((Cursor)o).moveToPosition(-1);
                final Set c = atzj.c();
                while (((Cursor)o).moveToNext()) {
                    if (((Cursor)o).getInt(columnIndex7) == 0) {
                        final int int4 = ((Cursor)o).getInt(columnIndex6);
                        final ArrayList list2 = new ArrayList();
                        final ArrayList list3 = new ArrayList();
                        final ArrayList list4 = new ArrayList();
                        for (final Object next : list) {
                            if (((cgf)next).a == int4) {
                                list4.add(next);
                            }
                        }
                        for (final cgf cgf : list4) {
                            list2.add(cgf.b);
                            list3.add(cgf.c);
                        }
                        final String string6 = ((Cursor)o).getString(columnIndex8);
                        string6.getClass();
                        final String string7 = ((Cursor)o).getString(columnIndex9);
                        string7.getClass();
                        final String string8 = ((Cursor)o).getString(columnIndex10);
                        string8.getClass();
                        c.add(new cge(string6, string7, string8, list2, list3));
                    }
                }
                atzj.f(c);
                auek.c((Closeable)o, null);
                final StringBuilder sb2 = new StringBuilder("PRAGMA index_list(`");
                sb2.append(s);
                sb2.append("`)");
                final Cursor b3 = cgp.b(sb2.toString());
                final String s4 = s3;
                try {
                    final int columnIndex15 = b3.getColumnIndex(s4);
                    final int columnIndex16 = b3.getColumnIndex("origin");
                    final int columnIndex17 = b3.getColumnIndex("unique");
                    if (columnIndex15 != -1 && columnIndex16 != -1 && columnIndex17 != -1) {
                        o = atzj.c();
                        final String s5 = s2;
                        while (b3.moveToNext()) {
                            if (atqz.c("c", b3.getString(columnIndex16))) {
                                final String string9 = b3.getString(columnIndex15);
                                final boolean b4 = b3.getInt(columnIndex17) == 1;
                                string9.getClass();
                                final StringBuilder sb3 = new StringBuilder();
                                sb3.append("PRAGMA index_xinfo(`");
                                sb3.append(string9);
                                sb3.append(s5);
                                final Cursor b5 = cgp.b(sb3.toString());
                                try {
                                    final int columnIndex18 = b5.getColumnIndex("seqno");
                                    final int columnIndex19 = b5.getColumnIndex("cid");
                                    final int columnIndex20 = b5.getColumnIndex(s4);
                                    final int columnIndex21 = b5.getColumnIndex("desc");
                                    Object o2;
                                    if (columnIndex18 != -1 && columnIndex19 != -1 && columnIndex20 != -1 && columnIndex21 != -1) {
                                        final TreeMap treeMap = new TreeMap();
                                        final TreeMap treeMap2 = new TreeMap();
                                        while (b5.moveToNext()) {
                                            if (b5.getInt(columnIndex19) >= 0) {
                                                final int int5 = b5.getInt(columnIndex18);
                                                final String string10 = b5.getString(columnIndex20);
                                                String s6;
                                                if (b5.getInt(columnIndex21) > 0) {
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
                                        final List i = atzd.i((Iterable)values);
                                        final Collection values2 = treeMap2.values();
                                        values2.getClass();
                                        o2 = new cgg(string9, b4, i, atzd.i((Iterable)values2));
                                        auek.c((Closeable)b5, null);
                                    }
                                    else {
                                        auek.c((Closeable)b5, null);
                                        o2 = null;
                                    }
                                    if (o2 == null) {
                                        auek.c((Closeable)b3, null);
                                        return new cgh(s, (Map)b, c, (Set)cgp);
                                    }
                                    ((Set<Object>)o).add(o2);
                                }
                                finally {
                                    try {}
                                    finally {
                                        auek.c((Closeable)b5, (Throwable)cgp);
                                    }
                                }
                            }
                        }
                        atzj.f((Set)o);
                        auek.c((Closeable)b3, null);
                        cgp = (cgp)o;
                    }
                    else {
                        auek.c((Closeable)b3, null);
                        cgp = null;
                    }
                    return new cgh(s, (Map)b, c, (Set)cgp);
                }
                finally {
                    try {}
                    finally {
                        auek.c((Closeable)b3, (Throwable)cgp);
                    }
                }
            }
            finally {
                try {}
                finally {
                    auek.c((Closeable)o, (Throwable)s);
                }
            }
        }
        finally {
            try {}
            finally {
                auek.c((Closeable)b, (Throwable)cgp);
                while (true) {}
            }
        }
    }
    
    public static final boolean d(String substring, final String s) {
        if (!atqz.c(substring, s)) {
            final int length = substring.length();
            final int n = 0;
            if (length != 0) {
                int i = 0;
                int n2 = 0;
                int n7;
                for (int n3 = 0; i < substring.length(); ++i, ++n3, n2 = n7) {
                    final char char1 = substring.charAt(i);
                    int n4 = n3;
                    int n5 = char1;
                    if (n3 == 0) {
                        if (char1 != '(') {
                            return false;
                        }
                        n4 = 0;
                        n5 = 40;
                    }
                    final int n6 = n4;
                    if (n5 == 40) {
                        n7 = n2 + 1;
                    }
                    else {
                        n7 = n2;
                        if (n5 == 41) {
                            n7 = --n2;
                            if (n2 == 0) {
                                n7 = n2;
                                if (n6 != substring.length() - 1) {
                                    return false;
                                }
                            }
                        }
                    }
                }
                if (n2 == 0) {
                    substring = substring.substring(1, substring.length() - 1);
                    substring.getClass();
                    int n8 = substring.length() - 1;
                    boolean b = false;
                    int j = n;
                    while (j <= n8) {
                        int n9;
                        if (!b) {
                            n9 = j;
                        }
                        else {
                            n9 = n8;
                        }
                        final boolean b2 = asbq.b(substring.charAt(n9));
                        if (!b) {
                            if (!b2) {
                                b = true;
                            }
                            else {
                                ++j;
                            }
                        }
                        else {
                            if (!b2) {
                                break;
                            }
                            --n8;
                        }
                    }
                    return atqz.c(substring.subSequence(j, n8 + 1).toString(), s);
                }
            }
            return false;
        }
        return true;
    }
    
    public static yrd e(int b, final btn btn, final bat bat) {
        yrd yrd = yrd.e(btn, bat);
        while (true) {
            final int b2 = yrd.b;
            if (b2 == b) {
                return yrd;
            }
            final StringBuilder sb = new StringBuilder("Ignoring unknown WAV chunk: ");
            sb.append(b2);
            baq.c("WavHeaderReader", sb.toString());
            final long n = yrd.a + 8L;
            if (n > 2147483647L) {
                b = yrd.b;
                final StringBuilder sb2 = new StringBuilder("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(b);
                throw azb.d(sb2.toString());
            }
            btn.m((int)n);
            yrd = yrd.e(btn, bat);
        }
    }
}
