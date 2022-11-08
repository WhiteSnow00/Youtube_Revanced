import androidx.work.impl.WorkDatabase;
import android.database.Cursor;
import android.app.job.JobInfo$TriggerContentUri;
import android.net.NetworkRequest$Builder;
import android.os.Build$VERSION;
import android.app.job.JobInfo$Builder;
import java.util.Locale;
import android.content.ComponentName;
import androidx.work.impl.background.systemjob.SystemJobService;
import android.util.Log;
import android.os.PersistableBundle;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cow implements cnu
{
    private static final String a;
    private final Context b;
    private final JobScheduler c;
    private final coe d;
    private final cov e;
    
    static {
        a = cmr.b("SystemJobScheduler");
    }
    
    public cow(final Context b, final coe d) {
        final JobScheduler c = (JobScheduler)b.getSystemService("jobscheduler");
        final cov e = new cov(b);
        this.b = b;
        this.d = d;
        this.c = c;
        this.e = e;
    }
    
    public static void a(final Context context) {
        final JobScheduler jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            final List h = h(context, jobScheduler);
            if (h != null && !h.isEmpty()) {
                final Iterator iterator = h.iterator();
                while (iterator.hasNext()) {
                    i(jobScheduler, ((JobInfo)iterator.next()).getId());
                }
            }
        }
    }
    
    public static boolean f(Context d, final coe coe) {
        final JobScheduler jobScheduler = (JobScheduler)d.getSystemService("jobscheduler");
        final List h = h(d, jobScheduler);
        final cqq t = coe.d.t();
        final boolean b = false;
        Object o = cfu.a("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        final cqu cqu = (cqu)t;
        cqu.a.j();
        Object d2 = bsf.d(cqu.a, (cgr)o, false);
        try {
            final ArrayList list = new ArrayList(((Cursor)d2).getCount());
            while (((Cursor)d2).moveToNext()) {
                Object string;
                if (((Cursor)d2).isNull(0)) {
                    string = null;
                }
                else {
                    string = ((Cursor)d2).getString(0);
                }
                list.add(string);
            }
            ((Cursor)d2).close();
            ((cfu)o).j();
            int size;
            if (h != null) {
                size = h.size();
            }
            else {
                size = 0;
            }
            final HashSet set = new HashSet(size);
            if (h != null && !h.isEmpty()) {
                final Iterator iterator = h.iterator();
                while (iterator.hasNext()) {
                    d2 = iterator.next();
                    o = g((JobInfo)d2);
                    if (o != null) {
                        set.add((Object)((cqv)o).a);
                    }
                    else {
                        i(jobScheduler, ((JobInfo)d2).getId());
                    }
                }
            }
            final Iterator iterator2 = list.iterator();
            while (true) {
                do {
                    final boolean b2 = b;
                    if (iterator2.hasNext()) {
                        continue;
                    }
                    if (b2) {
                        d = (Context)coe.d;
                        ((cfs)d).k();
                        try {
                            final crh w = ((WorkDatabase)d).w();
                            final Iterator iterator3 = list.iterator();
                            while (iterator3.hasNext()) {
                                w.j((String)iterator3.next(), -1L);
                            }
                            ((cfs)d).n();
                        }
                        finally {
                            ((cfs)d).l();
                        }
                    }
                    return b2;
                } while (set.contains(iterator2.next()));
                cmr.a();
                final boolean b2 = true;
                continue;
            }
        }
        finally {
            ((Cursor)d2).close();
            ((cfu)o).j();
            while (true) {}
        }
    }
    
    private static cqv g(final JobInfo jobInfo) {
        final PersistableBundle extras = jobInfo.getExtras();
        Label_0043: {
            if (extras == null) {
                break Label_0043;
            }
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new cqv(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            }
            catch (final NullPointerException ex) {
                return null;
            }
        }
    }
    
    private static List h(final Context context, final JobScheduler jobScheduler) {
        List list = null;
        try {
            jobScheduler.getAllPendingJobs();
        }
        finally {
            cmr.a();
            final Throwable t;
            Log.e(cow.a, "getAllPendingJobs() is not reliable on this device.", t);
            list = null;
        }
        if (list == null) {
            return null;
        }
        final ArrayList list2 = new ArrayList(list.size());
        final ComponentName componentName = new ComponentName(context, (Class)SystemJobService.class);
        for (final JobInfo jobInfo : list) {
            if (componentName.equals((Object)jobInfo.getService())) {
                list2.add((Object)jobInfo);
            }
        }
        return list2;
    }
    
    private static void i(final JobScheduler jobScheduler, final int n) {
        try {
            jobScheduler.cancel(n);
        }
        finally {
            cmr.a();
            final Throwable t;
            Log.e(cow.a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", n), t);
        }
    }
    
    public final void b(final String s) {
        final List h = h(this.b, this.c);
        List list;
        if (h == null) {
            list = null;
        }
        else {
            list = new ArrayList(2);
            for (final JobInfo jobInfo : h) {
                final cqv g = g(jobInfo);
                if (g != null && s.equals(g.a)) {
                    list.add(jobInfo.getId());
                }
            }
        }
        if (list != null && !list.isEmpty()) {
            final Iterator iterator2 = list.iterator();
            while (iterator2.hasNext()) {
                i(this.c, (int)iterator2.next());
            }
            final cqq t = this.d.d.t();
            final cqu cqu = (cqu)t;
            cqu.a.j();
            final chb d = cqu.c.d();
            if (s == null) {
                d.f(1);
            }
            else {
                d.g(1, s);
            }
            cqu.a.k();
            try {
                d.b();
                ((cqu)t).a.n();
            }
            finally {
                cqu.a.l();
                cqu.c.f(d);
            }
        }
    }
    
    public final void c(final crg... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        cow.d:Lcoe;
        //     4: getfield        coe.d:Landroidx/work/impl/WorkDatabase;
        //     7: astore_2       
        //     8: new             Lavt;
        //    11: dup            
        //    12: aload_2        
        //    13: aconst_null    
        //    14: invokespecial   avt.<init>:(Landroidx/work/impl/WorkDatabase;[B)V
        //    17: astore_3       
        //    18: aload_1        
        //    19: arraylength    
        //    20: istore          4
        //    22: iconst_0       
        //    23: istore          5
        //    25: iload           5
        //    27: iload           4
        //    29: if_icmpge       357
        //    32: aload_1        
        //    33: iload           5
        //    35: aaload         
        //    36: astore          6
        //    38: aload_2        
        //    39: invokevirtual   cfs.k:()V
        //    42: aload_2        
        //    43: invokevirtual   androidx/work/impl/WorkDatabase.w:()Lcrh;
        //    46: aload           6
        //    48: getfield        crg.c:Ljava/lang/String;
        //    51: invokeinterface crh.a:(Ljava/lang/String;)Lcrg;
        //    56: astore          7
        //    58: aload           7
        //    60: ifnonnull       129
        //    63: invokestatic    cmr.a:()Lcmr;
        //    66: pop            
        //    67: getstatic       cow.a:Ljava/lang/String;
        //    70: astore          7
        //    72: new             Ljava/lang/StringBuilder;
        //    75: astore          8
        //    77: aload           8
        //    79: invokespecial   java/lang/StringBuilder.<init>:()V
        //    82: aload           8
        //    84: ldc_w           "Skipping scheduling "
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    90: pop            
        //    91: aload           8
        //    93: aload           6
        //    95: getfield        crg.c:Ljava/lang/String;
        //    98: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   101: pop            
        //   102: aload           8
        //   104: ldc_w           " because it's no longer in the DB"
        //   107: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   110: pop            
        //   111: aload           7
        //   113: aload           8
        //   115: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   118: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   121: pop            
        //   122: aload_2        
        //   123: invokevirtual   cfs.n:()V
        //   126: goto            340
        //   129: aload           7
        //   131: getfield        crg.t:I
        //   134: iconst_1       
        //   135: if_icmpeq       204
        //   138: invokestatic    cmr.a:()Lcmr;
        //   141: pop            
        //   142: getstatic       cow.a:Ljava/lang/String;
        //   145: astore          8
        //   147: new             Ljava/lang/StringBuilder;
        //   150: astore          7
        //   152: aload           7
        //   154: invokespecial   java/lang/StringBuilder.<init>:()V
        //   157: aload           7
        //   159: ldc_w           "Skipping scheduling "
        //   162: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   165: pop            
        //   166: aload           7
        //   168: aload           6
        //   170: getfield        crg.c:Ljava/lang/String;
        //   173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   176: pop            
        //   177: aload           7
        //   179: ldc_w           " because it is no longer enqueued"
        //   182: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   185: pop            
        //   186: aload           8
        //   188: aload           7
        //   190: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   193: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   196: pop            
        //   197: aload_2        
        //   198: invokevirtual   cfs.n:()V
        //   201: goto            340
        //   204: aload           6
        //   206: invokestatic    cht.j:(Lcrg;)Lcqv;
        //   209: astore          7
        //   211: aload_2        
        //   212: invokevirtual   androidx/work/impl/WorkDatabase.t:()Lcqq;
        //   215: aload           7
        //   217: invokestatic    col.b:(Lcqq;Lcqv;)Lcqp;
        //   220: astore          8
        //   222: aload           8
        //   224: ifnull          237
        //   227: aload           8
        //   229: getfield        cqp.c:I
        //   232: istore          9
        //   234: goto            297
        //   237: aload_0        
        //   238: getfield        cow.d:Lcoe;
        //   241: getfield        coe.c:Lcmc;
        //   244: getfield        cmc.i:I
        //   247: istore          9
        //   249: aload_3        
        //   250: getfield        avt.a:Ljava/lang/Object;
        //   253: astore          10
        //   255: new             Lcsh;
        //   258: astore          11
        //   260: aload           11
        //   262: aload_3        
        //   263: iconst_2       
        //   264: aconst_null    
        //   265: aconst_null    
        //   266: invokespecial   csh.<init>:(Lavt;I[B[B)V
        //   269: aload           10
        //   271: checkcast       Lcfs;
        //   274: aload           11
        //   276: invokevirtual   cfs.d:(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
        //   279: astore          10
        //   281: aload           10
        //   283: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   286: pop            
        //   287: aload           10
        //   289: checkcast       Ljava/lang/Number;
        //   292: invokevirtual   java/lang/Number.intValue:()I
        //   295: istore          9
        //   297: aload           8
        //   299: ifnonnull       328
        //   302: aload           7
        //   304: iload           9
        //   306: invokestatic    cox.c:(Lcqv;I)Lcqp;
        //   309: astore          7
        //   311: aload_0        
        //   312: getfield        cow.d:Lcoe;
        //   315: getfield        coe.d:Landroidx/work/impl/WorkDatabase;
        //   318: invokevirtual   androidx/work/impl/WorkDatabase.t:()Lcqq;
        //   321: aload           7
        //   323: invokeinterface cqq.a:(Lcqp;)V
        //   328: aload_0        
        //   329: aload           6
        //   331: iload           9
        //   333: invokevirtual   cow.e:(Lcrg;I)V
        //   336: aload_2        
        //   337: invokevirtual   cfs.n:()V
        //   340: aload_2        
        //   341: invokevirtual   cfs.l:()V
        //   344: iinc            5, 1
        //   347: goto            25
        //   350: astore_1       
        //   351: aload_2        
        //   352: invokevirtual   cfs.l:()V
        //   355: aload_1        
        //   356: athrow         
        //   357: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  42     58     350    357    Any
        //  63     126    350    357    Any
        //  129    201    350    357    Any
        //  204    222    350    357    Any
        //  227    234    350    357    Any
        //  237    297    350    357    Any
        //  302    328    350    357    Any
        //  328    340    350    357    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final boolean d() {
        return true;
    }
    
    public final void e(crg f, int size) {
        final cov e = this.e;
        final cme k = ((crg)f).k;
        final PersistableBundle extras = new PersistableBundle();
        extras.putString("EXTRA_WORK_SPEC_ID", ((crg)f).c);
        extras.putInt("EXTRA_WORK_SPEC_GENERATION", ((crg)f).s);
        extras.putBoolean("EXTRA_IS_PERIODIC", ((crg)f).e());
        final JobInfo$Builder setExtras = new JobInfo$Builder(size, e.a).setRequiresCharging(k.b).setRequiresDeviceIdle(k.c).setExtras(extras);
        final int i = k.i;
        if (Build$VERSION.SDK_INT >= 30 && i == 6) {
            setExtras.setRequiredNetwork(new NetworkRequest$Builder().addCapability(25).build());
        }
        else {
            final int n = i - 1;
            int requiredNetworkType = 0;
            Label_0207: {
                if (n != 0) {
                    if (n != 1) {
                        if (n == 2) {
                            requiredNetworkType = 2;
                            break Label_0207;
                        }
                        if (n == 3) {
                            requiredNetworkType = 3;
                            break Label_0207;
                        }
                        requiredNetworkType = 4;
                        if (n == 4) {
                            break Label_0207;
                        }
                        cmr.a();
                        clk.f(i);
                    }
                    requiredNetworkType = 1;
                }
                else {
                    requiredNetworkType = 0;
                }
            }
            setExtras.setRequiredNetworkType(requiredNetworkType);
        }
        if (!k.c) {
            int n2;
            if (((crg)f).u == 2) {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            setExtras.setBackoffCriteria(((crg)f).m, n2);
        }
        final long max = Math.max(((crg)f).a() - System.currentTimeMillis(), 0L);
        if (Build$VERSION.SDK_INT <= 28) {
            setExtras.setMinimumLatency(max);
        }
        else if (max > 0L) {
            setExtras.setMinimumLatency(max);
        }
        else if (!((crg)f).q) {
            setExtras.setImportantWhileForeground(true);
        }
        if (k.a()) {
            for (final cmd cmd : k.h) {
                setExtras.addTriggerContentUri(new JobInfo$TriggerContentUri(cmd.a, (int)(cmd.b ? 1 : 0)));
            }
            setExtras.setTriggerContentUpdateDelay(k.f);
            setExtras.setTriggerContentMaxDelay(k.g);
        }
        setExtras.setPersisted(false);
        setExtras.setRequiresBatteryNotLow(k.d);
        setExtras.setRequiresStorageNotLow(k.e);
        final int l = ((crg)f).l;
        if (Build$VERSION.SDK_INT >= 31 && ((crg)f).q && l <= 0 && max <= 0L) {
            setExtras.setExpedited(true);
        }
        final JobInfo build = setExtras.build();
        cmr.a();
        final String c = ((crg)f).c;
        try {
            if (this.c.schedule(build) == 0) {
                cmr.a();
                final String a = cow.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to schedule work ID ");
                sb.append(((crg)f).c);
                Log.w(a, sb.toString());
                if (((crg)f).q && ((crg)f).v == 1) {
                    ((crg)f).q = false;
                    String.format("Scheduling a non-expedited job (work ID %s)", ((crg)f).c);
                    cmr.a();
                    this.e((crg)f, size);
                }
            }
        }
        catch (IllegalStateException f) {
            final List h = h(this.b, this.c);
            if (h != null) {
                size = h.size();
            }
            else {
                size = 0;
            }
            final Locale default1 = Locale.getDefault();
            final int size2 = this.d.d.w().c().size();
            final int j = this.d.c.j;
            final String format = String.format(default1, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", size, size2, 20);
            cmr.a();
            Log.e(cow.a, format);
            final IllegalStateException ex = new IllegalStateException(format, f);
            f = (IllegalStateException)this.d.c.f;
            throw ex;
        }
        finally {
            cmr.a();
            final String a2 = cow.a;
            new StringBuilder("Unable to schedule ").append(f);
            final Throwable t;
            Log.e(a2, "Unable to schedule ".concat(String.valueOf(f)), t);
        }
    }
}
