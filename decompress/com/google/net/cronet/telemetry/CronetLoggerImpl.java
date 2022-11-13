// 
// Decompiled by Procyon v0.6.0
// 

package com.google.net.cronet.telemetry;

import java.util.Iterator;
import org.json.JSONException;
import java.util.Locale;
import java.util.ArrayList;
import java.security.NoSuchAlgorithmException;
import java.nio.ByteBuffer;
import j$.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;

public class CronetLoggerImpl extends audh
{
    private final AtomicInteger a;
    private final aguo b;
    
    public CronetLoggerImpl(final int n) {
        final aguo b = new aguo(n);
        this.a = new AtomicInteger();
        this.b = b;
    }
    
    private static long c(final String s) {
        long long1;
        final long n = long1 = 0L;
        if (s == null) {
            return long1;
        }
        if (s.isEmpty()) {
            long1 = n;
            return long1;
        }
        try {
            long1 = ByteBuffer.wrap(MessageDigest.getInstance("MD5").digest(s.getBytes(StandardCharsets.UTF_8))).getLong();
            return long1;
        }
        catch (final NoSuchAlgorithmException ex) {
            long1 = n;
            return long1;
        }
    }
    
    public final void a(int n, final audf ex) {
        if (!this.b.a()) {
            this.a.incrementAndGet();
            return;
        }
        final long n2 = n;
        final int andSet = this.a.getAndSet(0);
        try {
            final long a = ((audf)ex).a;
            agpi.h(a, "Request header size is negative");
            final double n3 = (double)a;
            Double.isNaN(n3);
            final double n4 = n3 / 1024.0;
            final boolean i = agpi.i(n4, 0, 1);
            int n5 = 4;
            int n6;
            if (i) {
                n6 = 1;
            }
            else if (agpi.i(n4, 1, 10)) {
                n6 = 2;
            }
            else if (agpi.i(n4, 10, 25)) {
                n6 = 3;
            }
            else if (agpi.i(n4, 25, 50)) {
                n6 = 4;
            }
            else if (agpi.i(n4, 50, 100)) {
                n6 = 5;
            }
            else {
                n6 = 6;
            }
            final long b = ((audf)ex).b;
            agpi.h(b, "Request body size is negative");
            final double n7 = (double)b;
            Double.isNaN(n7);
            final double n8 = n7 / 1024.0;
            if (n8 == 0.0) {
                n = 1;
            }
            else if (n8 > 0.0 && n8 < 10.0) {
                n = 2;
            }
            else if (agpi.i(n8, 10, 50)) {
                n = 3;
            }
            else if (agpi.i(n8, 50, 200)) {
                n = 4;
            }
            else if (agpi.i(n8, 200, 500)) {
                n = 5;
            }
            else if (agpi.i(n8, 500, 1000)) {
                n = 6;
            }
            else if (agpi.i(n8, 1000, 5000)) {
                n = 7;
            }
            else {
                n = 8;
            }
            final long c = ((audf)ex).c;
            agpi.h(c, "Response header size is negative");
            final double n9 = (double)c;
            Double.isNaN(n9);
            final double n10 = n9 / 1024.0;
            int n11;
            if (agpi.i(n10, 0, 1)) {
                n11 = 1;
            }
            else if (agpi.i(n10, 1, 10)) {
                n11 = 2;
            }
            else if (agpi.i(n10, 10, 25)) {
                n11 = 3;
            }
            else if (agpi.i(n10, 25, 50)) {
                n11 = 4;
            }
            else if (agpi.i(n10, 50, 100)) {
                n11 = 5;
            }
            else {
                n11 = 6;
            }
            final long d = ((audf)ex).d;
            agpi.h(d, "Response body size is negative");
            final double n12 = (double)d;
            Double.isNaN(n12);
            final double n13 = n12 / 1024.0;
            if (n13 == 0.0) {
                n5 = 1;
            }
            else if (n13 > 0.0 && n13 < 10.0) {
                n5 = 2;
            }
            else if (agpi.i(n13, 10, 50)) {
                n5 = 3;
            }
            else if (!agpi.i(n13, 50, 200)) {
                if (agpi.i(n13, 200, 500)) {
                    n5 = 5;
                }
                else if (agpi.i(n13, 500, 1000)) {
                    n5 = 6;
                }
                else if (agpi.i(n13, 1000, 5000)) {
                    n5 = 7;
                }
                else {
                    n5 = 8;
                }
            }
            final int e = ((audf)ex).e;
            final long c2 = c(((audf)ex).h);
            final int n14 = (int)((audf)ex).f.toMillis();
            final int n15 = (int)((audf)ex).g.toMillis();
            final boolean j = ((audf)ex).i;
            final boolean k = ((audf)ex).j;
            try {
                agqs.d(n2, n6, n, n11, n5, e, c2, n14, n15, j, k, andSet);
                return;
            }
            catch (final RuntimeException ex) {}
        }
        catch (final RuntimeException ex2) {}
        this.a.addAndGet(andSet);
        String.format("Failed to log cronet traffic sample for CronetEngine %s: %s", n2, ex.getMessage());
    }
    
    public final void b(int n, aude string, audg ex, int n2) {
        final long n3 = n;
        Label_0979: {
            try {
                final agun agun = new agun(((aude)string).f);
                final int a = ((audg)ex).a;
                final int b = ((audg)ex).b;
                final int c = ((audg)ex).c;
                final int d = ((audg)ex).d;
                --n2;
                n = 3;
                if (n2 != 1) {
                    if (n2 != 2) {
                        n2 = 3;
                    }
                    else {
                        n2 = 2;
                    }
                }
                else {
                    n2 = 1;
                }
                final boolean d2 = ((aude)string).d;
                final boolean c2 = ((aude)string).c;
                final int e = ((aude)string).e;
                if (e != 0) {
                    if (e != 1) {
                        if (e != 2) {
                            n = 4;
                        }
                    }
                    else {
                        n = 2;
                    }
                }
                else {
                    n = 1;
                }
                final boolean a2 = ((aude)string).a;
                final boolean b2 = ((aude)string).b;
                final boolean g = ((aude)string).g;
                final int h = ((aude)string).h;
                string = (RuntimeException)agun.a("QUIC", "connection_options", (Object)null, (Class)String.class);
                if (!agun.b((String)string)) {
                    try {
                        final ArrayList<Object> list = new ArrayList<Object>();
                        for (final String s : ((String)string).split(",", -1)) {
                            if (agun.a.contains(s.toUpperCase(Locale.ROOT).trim())) {
                                list.add(s);
                            }
                        }
                        final StringBuilder sb = new StringBuilder();
                        ex = (ClassCastException)list.iterator();
                        if (((Iterator)ex).hasNext()) {
                            CharSequence charSequence = ((Iterator<CharSequence>)ex).next();
                            while (true) {
                                sb.append(charSequence);
                                if (!((Iterator)ex).hasNext()) {
                                    break;
                                }
                                sb.append((CharSequence)",");
                                charSequence = ((Iterator<CharSequence>)ex).next();
                            }
                        }
                        string = (RuntimeException)sb.toString();
                    }
                    catch (final RuntimeException string) {
                        break Label_0979;
                    }
                }
                final int b3 = agqs.b(agqs.c((Boolean)agun.a("QUIC", "store_server_configs_in_properties", (Object)null, (Class)Boolean.class)));
                final int intValue = (int)agun.a("QUIC", "max_server_configs_stored_in_properties", (Object)(-1), (Class)Integer.class);
                final int intValue2 = (int)agun.a("QUIC", "idle_connection_timeout_seconds", (Object)(-1), (Class)Integer.class);
                final int b4 = agqs.b(agqs.c((Boolean)agun.a("QUIC", "goaway_sessions_on_ip_change", (Object)null, (Class)Boolean.class)));
                final int b5 = agqs.b(agqs.c((Boolean)agun.a("QUIC", "close_sessions_on_ip_change", (Object)null, (Class)Boolean.class)));
                final int b6 = agqs.b(agqs.c((Boolean)agun.a("QUIC", "migrate_sessions_on_network_change_v2", (Object)null, (Class)Boolean.class)));
                final int b7 = agqs.b(agqs.c((Boolean)agun.a("QUIC", "migrate_sessions_early_v2", (Object)null, (Class)Boolean.class)));
                final int b8 = agqs.b(agqs.c((Boolean)agun.a("QUIC", "disable_bidirectional_streams", (Object)null, (Class)Boolean.class)));
                final int intValue3 = (int)agun.a("QUIC", "max_time_before_crypto_handshake_seconds", (Object)(-1), (Class)Integer.class);
                final int intValue4 = (int)agun.a("QUIC", "max_idle_time_before_crypto_handshake_seconds", (Object)(-1), (Class)Integer.class);
                final int b9 = agqs.b(agqs.c((Boolean)agun.a("QUIC", "enable_socket_recv_optimization", (Object)null, (Class)Boolean.class)));
                final int b10 = agqs.b(agqs.c((Boolean)agun.a("AsyncDNS", "enable", (Object)null, (Class)Boolean.class)));
                final int b11 = agqs.b(agqs.c((Boolean)agun.a("StaleDNS", "enable", (Object)null, (Class)Boolean.class)));
                final int intValue5 = (int)agun.a("StaleDNS", "delay_ms", (Object)(-1), (Class)Integer.class);
                final int intValue6 = (int)agun.a("StaleDNS", "max_expired_time_ms", (Object)(-1), (Class)Integer.class);
                final int intValue7 = (int)agun.a("StaleDNS", "max_stale_uses", (Object)(-1), (Class)Integer.class);
                final int b12 = agqs.b(agqs.c((Boolean)agun.a("StaleDNS", "allow_other_network", (Object)null, (Class)Boolean.class)));
                final int b13 = agqs.b(agqs.c((Boolean)agun.a("StaleDNS", "persist_to_disk", (Object)null, (Class)Boolean.class)));
                final int intValue8 = (int)agun.a("StaleDNS", "persist_delay_ms", (Object)(-1), (Class)Integer.class);
                final int b14 = agqs.b(agqs.c((Boolean)agun.a("StaleDNS", "use_stale_on_name_not_resolved", (Object)null, (Class)Boolean.class)));
                Label_0890: {
                    try {
                        ex = (ClassCastException)Boolean.class.cast(agun.b.get("disable_ipv6_on_wifi"));
                        break Label_0890;
                    }
                    catch (final ClassCastException ex) {}
                    catch (final JSONException ex2) {}
                    String.format("Failed to get %s options: %s", "disable_ipv6_on_wifi", ex.getMessage());
                    ex = null;
                }
                final int b15 = agqs.b(agqs.c((Boolean)ex));
                try {
                    agqs.e(n3, a, b, c, d, n2, d2, c2, n, a2, b2, g, h, (String)string, b3, intValue, intValue2, b4, b5, b6, b7, b8, intValue3, intValue4, b9, b10, b11, intValue5, intValue6, intValue7, b12, b13, intValue8, b14, b15);
                    return;
                }
                catch (final RuntimeException string) {}
            }
            catch (final RuntimeException ex3) {}
        }
        String.format("Failed to log CronetEngine:%s creation: %s", n3, string.getMessage());
    }
}
