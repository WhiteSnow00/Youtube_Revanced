import android.os.SystemClock;
import android.util.Pair;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import android.content.ContentResolver;
import java.util.List;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import android.graphics.Typeface;
import android.content.Context;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class des
{
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    
    public des() {
        this.d = new abh();
        this.c = new SparseArray();
        this.a = new abl();
        this.b = new abh();
    }
    
    public des(Context applicationContext, final ajb ajb, final byte[] array, final byte[] array2, final byte[] array3) {
        applicationContext.getClass();
        final Context applicationContext2 = applicationContext.getApplicationContext();
        applicationContext2.getClass();
        final cpp b = new cpp(applicationContext2, ajb, null, null, null);
        final Context applicationContext3 = applicationContext.getApplicationContext();
        applicationContext3.getClass();
        final cpr c = new cpr(applicationContext3, ajb, null, null, null);
        final Context applicationContext4 = applicationContext.getApplicationContext();
        applicationContext4.getClass();
        final cpw b2 = cqa.b(applicationContext4, ajb);
        applicationContext = applicationContext.getApplicationContext();
        applicationContext.getClass();
        final cqb a = new cqb(applicationContext, ajb, null, null, null);
        this.b = b;
        this.c = c;
        this.d = b2;
        this.a = a;
    }
    
    public des(final Typeface b, final chs a) {
        this.b = b;
        this.a = a;
        this.c = new bki(1024);
        final chs chs = a;
        final int e = a.e();
        this.d = new char[e + e];
        final chs chs2 = a;
        for (int e2 = a.e(), i = 0; i < e2; ++i) {
            final aru aru = new aru(this, i, (byte[])null, (byte[])null, (byte[])null);
            Character.toChars(aru.c(), (char[])this.d, i + i);
            afg.e(aru.b() > 0, "invalid metadata codepoint length");
            ((bki)this.c).g(aru, 0, aru.b() - 1);
        }
    }
    
    public des(final bpe a, final boolean[] c) {
        this.a = a;
        this.c = c;
        final int b = a.b;
        this.b = new boolean[b];
        this.d = new boolean[b];
    }
    
    public des(final cwn c, final cwn a, final cwo b, final cwo d) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public des(final String a, final String b, final long[] c, final EventMessage[] d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public des(final List d, final der a, final dge b, final ContentResolver c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public des(final byte[] array) {
        final Random d = new Random();
        this.a = new HashMap();
        this.d = d;
        this.c = new HashMap();
        this.b = new HashMap();
    }
    
    public static void d(final Object o, final long n, final Map map) {
        long max = n;
        if (map.containsKey(o)) {
            final Long n2 = map.get(o);
            final int a = bax.a;
            max = Math.max(n, n2);
        }
        map.put(o, max);
    }
    
    private static void e(final long n, final Map map) {
        final ArrayList list = new ArrayList();
        for (final Map.Entry<K, Long> entry : map.entrySet()) {
            if (entry.getValue() <= n) {
                list.add(entry.getKey());
            }
        }
        for (int i = 0; i < list.size(); ++i) {
            map.remove(list.get(i));
        }
    }
    
    public final String a() {
        final Object a = this.a;
        final Object b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append((String)a);
        sb.append("/");
        sb.append((String)b);
        return sb.toString();
    }
    
    public final bjg b(List c) {
        c = this.c(c);
        if (c.size() < 2) {
            return (bjg)agpc.U(c, null);
        }
        Collections.sort((List<Object>)c, aar.c);
        final ArrayList list = new ArrayList();
        final int n = 0;
        final int c2 = c.get(0).c;
        int i = 0;
        while (i < c.size()) {
            final bjg bjg = c.get(i);
            if (c2 != bjg.c) {
                if (list.size() != 1) {
                    break;
                }
                return (bjg)c.get(0);
            }
            else {
                list.add(new Pair((Object)bjg.b, (Object)bjg.d));
                ++i;
            }
        }
        final bjg bjg2 = ((Map<K, bjg>)this.a).get(list);
        if (bjg2 == null) {
            final List subList = c.subList(0, list.size());
            int j = 0;
            int n2 = 0;
            while (j < subList.size()) {
                n2 += ((bjg)subList.get(j)).d;
                ++j;
            }
            final int nextInt = ((Random)this.d).nextInt(n2);
            int n3 = 0;
            while (true) {
                for (int k = n; k < subList.size(); ++k) {
                    final bjg bjg3 = (bjg)subList.get(k);
                    n3 += bjg3.d;
                    if (nextInt < n3) {
                        ((Map<ArrayList, bjg>)this.a).put(list, bjg3);
                        return bjg3;
                    }
                }
                final bjg bjg3 = (bjg)agpc.V(subList);
                continue;
            }
        }
        return bjg2;
    }
    
    public final List c(final List list) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        e(elapsedRealtime, (Map)this.c);
        e(elapsedRealtime, (Map)this.b);
        final ArrayList list2 = new ArrayList();
        for (int i = 0; i < list.size(); ++i) {
            final bjg bjg = list.get(i);
            if (!((Map)this.c).containsKey(bjg.b) && !((Map)this.b).containsKey(bjg.c)) {
                list2.add(bjg);
            }
        }
        return list2;
    }
}
