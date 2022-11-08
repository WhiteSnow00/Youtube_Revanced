import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import android.text.TextUtils;
import android.content.pm.ResolveInfo;
import java.util.function.Function;
import j$.util.Map$_EL;
import java.util.List;
import java.util.HashMap;
import java.util.Collection;
import com.google.protos.youtube.api.innertube.UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand;
import java.util.Map;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jri implements vau
{
    public final vax a;
    public final tny b;
    public final adfy c;
    public final oas d;
    private final vmt e;
    private final Executor f;
    private final Context g;
    private final uyf h;
    
    public jri(final vmt e, final vax a, final Executor f, final Context g, final uyf h, final tny b, final adfy c, final oas d) {
        e.getClass();
        this.e = e;
        a.getClass();
        this.a = a;
        f.getClass();
        this.f = f;
        g.getClass();
        this.g = g;
        h.getClass();
        this.h = h;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
    }
    
    public final void mE(final aioe aioe, final Map map) {
        final UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand updateShareSheetCommandOuterClass$UpdateShareSheetCommand = (UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand)((agzd)aioe).rr((agyr)UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand.updateShareSheetCommand);
        final List ak = tmy.ak(this.g.getPackageManager());
        amga amga;
        if ((amga = this.h.b().i) == null) {
            amga = amga.a;
        }
        ahsb ahsb;
        if ((ahsb = amga.m) == null) {
            ahsb = ahsb.a;
        }
        final List e = adbp.e(ak, ahsb);
        amga amga2;
        if ((amga2 = this.h.b().i) == null) {
            amga2 = amga.a;
        }
        ahsb ahsb2;
        if ((ahsb2 = amga2.m) == null) {
            ahsb2 = ahsb.a;
        }
        int e2 = 2;
        afcr c;
        if (ahsb2 != null && ahsb2.b.size() != 0) {
            final HashMap hashMap = new HashMap();
            for (final ahsc ahsc : ahsb2.b) {
                ((List)Map$_EL.computeIfAbsent((Map)hashMap, (Object)ahsc.c, (Function)acfd.d)).add(ahsc.b);
            }
            final HashMap q = ajox.Q(hashMap.size());
            for (final ResolveInfo resolveInfo : ak) {
                final String packageName = resolveInfo.activityInfo.applicationInfo.packageName;
                final String name = resolveInfo.activityInfo.name;
                if (packageName != null && !TextUtils.isEmpty((CharSequence)packageName) && name != null && !TextUtils.isEmpty((CharSequence)name) && hashMap.containsKey(packageName)) {
                    if (!q.containsKey(packageName)) {
                        q.put(packageName, ((agzi)akgy.a).createBuilder());
                        final agza agza = (agza)q.get(packageName);
                        agza.copyOnWrite();
                        final akgy akgy = (akgy)agza.instance;
                        akgy.b |= 0x2;
                        akgy.d = packageName;
                    }
                    final agza agza2 = (agza)q.get(packageName);
                    agza2.copyOnWrite();
                    final akgy akgy2 = (akgy)agza2.instance;
                    final akgy a = akgy.a;
                    final agzy e3 = akgy2.e;
                    if (!e3.c()) {
                        akgy2.e = agzi.mutableCopy(e3);
                    }
                    akgy2.e.add((Object)name);
                }
            }
            final ArrayList list = new ArrayList(q.size());
            for (final agza agza3 : q.values()) {
                for (final Integer n : (List)hashMap.get(((akgy)agza3.instance).d)) {
                    final agza agza4 = (agza)q.get(((akgy)agza3.instance).d);
                    final int intValue = n;
                    agza4.copyOnWrite();
                    final akgy akgy3 = (akgy)agza4.instance;
                    akgy3.b |= 0x1;
                    akgy3.c = intValue;
                    list.add((Object)agza3.build());
                }
            }
            c = afcr.o((Collection)list);
        }
        else {
            c = afcr.q();
        }
        final vmt e4 = this.e;
        final String c2 = updateShareSheetCommandOuterClass$UpdateShareSheetCommand.c;
        final int bx = aqql.bx(updateShareSheetCommandOuterClass$UpdateShareSheetCommand.d);
        if (bx != 0) {
            e2 = bx;
        }
        final String e5 = updateShareSheetCommandOuterClass$UpdateShareSheetCommand.e;
        final afsl a2 = afsl.a;
        final vmy vmy = new vmy(e4.c, e4.d.c(), (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null, (byte[])null);
        vmy.a = c2;
        vmy.b = e;
        vmy.c = c;
        vmy.e = e2;
        vmy.d = e5;
        final ListenableFuture b = ((vkm)e4).c((MessageLite)akhe.a, e4.f, (tad)vmq.f, (tac)vlh.r).b((vjn)vmy, (Executor)a2);
        final long c3 = this.d.c();
        tcp.k(b, this.f, (tcn)new jrg(this, updateShareSheetCommandOuterClass$UpdateShareSheetCommand, c3), (tco)new jrh(this, c3));
    }
}
