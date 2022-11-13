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

public final class cox implements cnv
{
    private static final String a;
    private final Context b;
    private final JobScheduler c;
    private final cof d;
    private final cow e;
    
    static {
        a = cms.b("SystemJobScheduler");
    }
    
    public cox(final Context b, final cof d) {
        final JobScheduler c = (JobScheduler)b.getSystemService("jobscheduler");
        final cow e = new cow(b);
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
    
    public static boolean f(Context d, final cof cof) {
        final JobScheduler jobScheduler = (JobScheduler)d.getSystemService("jobscheduler");
        final List h = h(d, jobScheduler);
        final cqr t = cof.d.t();
        final boolean b = false;
        Object o = cfv.a("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        final cqv cqv = (cqv)t;
        cqv.a.j();
        Object o2 = bsg.d(cqv.a, (cgs)o, false);
        try {
            final ArrayList list = new ArrayList(((Cursor)o2).getCount());
            while (((Cursor)o2).moveToNext()) {
                Object string;
                if (((Cursor)o2).isNull(0)) {
                    string = null;
                }
                else {
                    string = ((Cursor)o2).getString(0);
                }
                list.add(string);
            }
            ((Cursor)o2).close();
            ((cfv)o).j();
            int size;
            if (h != null) {
                size = h.size();
            }
            else {
                size = 0;
            }
            final HashSet set = new HashSet(size);
            if (h != null && !h.isEmpty()) {
                o = h.iterator();
                while (((Iterator)o).hasNext()) {
                    final JobInfo jobInfo = ((Iterator<JobInfo>)o).next();
                    o2 = g(jobInfo);
                    if (o2 != null) {
                        set.add((Object)((cqw)o2).a);
                    }
                    else {
                        i(jobScheduler, jobInfo.getId());
                    }
                }
            }
            final Iterator iterator = list.iterator();
            while (true) {
                do {
                    final boolean b2 = b;
                    if (iterator.hasNext()) {
                        continue;
                    }
                    if (b2) {
                        d = (Context)cof.d;
                        ((cft)d).k();
                        try {
                            final cri w = ((WorkDatabase)d).w();
                            final Iterator iterator2 = list.iterator();
                            while (iterator2.hasNext()) {
                                w.j((String)iterator2.next(), -1L);
                            }
                            ((cft)d).n();
                        }
                        finally {
                            ((cft)d).l();
                        }
                    }
                    return b2;
                } while (set.contains(iterator.next()));
                cms.a();
                final boolean b2 = true;
                continue;
            }
        }
        finally {
            ((Cursor)o2).close();
            ((cfv)o).j();
            while (true) {}
        }
    }
    
    private static cqw g(final JobInfo jobInfo) {
        final PersistableBundle extras = jobInfo.getExtras();
        Label_0043: {
            if (extras == null) {
                break Label_0043;
            }
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new cqw(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
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
            cms.a();
            final Throwable t;
            Log.e(cox.a, "getAllPendingJobs() is not reliable on this device.", t);
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
            cms.a();
            final Throwable t;
            Log.e(cox.a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", n), t);
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
                final cqw g = g(jobInfo);
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
            final cqr t = this.d.d.t();
            final cqv cqv = (cqv)t;
            cqv.a.j();
            final chc d = cqv.c.d();
            if (s == null) {
                d.f(1);
            }
            else {
                d.g(1, s);
            }
            cqv.a.k();
            try {
                d.b();
                ((cqv)t).a.n();
            }
            finally {
                cqv.a.l();
                cqv.c.f(d);
            }
        }
    }
    
    public final void c(final crh... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        cox.d:Lcof;
        //     4: getfield        cof.d:Landroidx/work/impl/WorkDatabase;
        //     7: astore          5
        //     9: new             Lavu;
        //    12: dup            
        //    13: aload           5
        //    15: aconst_null    
        //    16: invokespecial   avu.<init>:(Landroidx/work/impl/WorkDatabase;[B)V
        //    19: astore          7
        //    21: aload_1        
        //    22: arraylength    
        //    23: istore          4
        //    25: iconst_0       
        //    26: istore_2       
        //    27: iload_2        
        //    28: iload           4
        //    30: if_icmpge       362
        //    33: aload_1        
        //    34: iload_2        
        //    35: aaload         
        //    36: astore          6
        //    38: aload           5
        //    40: invokevirtual   cft.k:()V
        //    43: aload           5
        //    45: invokevirtual   androidx/work/impl/WorkDatabase.w:()Lcri;
        //    48: aload           6
        //    50: getfield        crh.c:Ljava/lang/String;
        //    53: invokeinterface cri.a:(Ljava/lang/String;)Lcrh;
        //    58: astore          8
        //    60: aload           8
        //    62: ifnonnull       132
        //    65: invokestatic    cms.a:()Lcms;
        //    68: pop            
        //    69: getstatic       cox.a:Ljava/lang/String;
        //    72: astore          8
        //    74: new             Ljava/lang/StringBuilder;
        //    77: astore          9
        //    79: aload           9
        //    81: invokespecial   java/lang/StringBuilder.<init>:()V
        //    84: aload           9
        //    86: ldc_w           "Skipping scheduling "
        //    89: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    92: pop            
        //    93: aload           9
        //    95: aload           6
        //    97: getfield        crh.c:Ljava/lang/String;
        //   100: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   103: pop            
        //   104: aload           9
        //   106: ldc_w           " because it's no longer in the DB"
        //   109: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   112: pop            
        //   113: aload           8
        //   115: aload           9
        //   117: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   120: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   123: pop            
        //   124: aload           5
        //   126: invokevirtual   cft.n:()V
        //   129: goto            343
        //   132: aload           8
        //   134: getfield        crh.t:I
        //   137: iconst_1       
        //   138: if_icmpeq       208
        //   141: invokestatic    cms.a:()Lcms;
        //   144: pop            
        //   145: getstatic       cox.a:Ljava/lang/String;
        //   148: astore          9
        //   150: new             Ljava/lang/StringBuilder;
        //   153: astore          8
        //   155: aload           8
        //   157: invokespecial   java/lang/StringBuilder.<init>:()V
        //   160: aload           8
        //   162: ldc_w           "Skipping scheduling "
        //   165: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   168: pop            
        //   169: aload           8
        //   171: aload           6
        //   173: getfield        crh.c:Ljava/lang/String;
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: pop            
        //   180: aload           8
        //   182: ldc_w           " because it is no longer enqueued"
        //   185: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   188: pop            
        //   189: aload           9
        //   191: aload           8
        //   193: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   196: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   199: pop            
        //   200: aload           5
        //   202: invokevirtual   cft.n:()V
        //   205: goto            343
        //   208: aload           6
        //   210: invokestatic    chu.j:(Lcrh;)Lcqw;
        //   213: astore          8
        //   215: aload           5
        //   217: invokevirtual   androidx/work/impl/WorkDatabase.t:()Lcqr;
        //   220: aload           8
        //   222: invokestatic    com.b:(Lcqr;Lcqw;)Lcqq;
        //   225: astore          9
        //   227: aload           9
        //   229: ifnull          241
        //   232: aload           9
        //   234: getfield        cqq.c:I
        //   237: istore_3       
        //   238: goto            301
        //   241: aload_0        
        //   242: getfield        cox.d:Lcof;
        //   245: getfield        cof.c:Lcmd;
        //   248: getfield        cmd.i:I
        //   251: istore_3       
        //   252: aload           7
        //   254: getfield        avu.a:Ljava/lang/Object;
        //   257: astore          10
        //   259: new             Lcsi;
        //   262: astore          11
        //   264: aload           11
        //   266: aload           7
        //   268: iconst_2       
        //   269: aconst_null    
        //   270: aconst_null    
        //   271: invokespecial   csi.<init>:(Lavu;I[B[B)V
        //   274: aload           10
        //   276: checkcast       Lcft;
        //   279: aload           11
        //   281: invokevirtual   cft.d:(Ljava/util/concurrent/Callable;)Ljava/lang/Object;
        //   284: astore          10
        //   286: aload           10
        //   288: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   291: pop            
        //   292: aload           10
        //   294: checkcast       Ljava/lang/Number;
        //   297: invokevirtual   java/lang/Number.intValue:()I
        //   300: istore_3       
        //   301: aload           9
        //   303: ifnonnull       331
        //   306: aload           8
        //   308: iload_3        
        //   309: invokestatic    coy.c:(Lcqw;I)Lcqq;
        //   312: astore          8
        //   314: aload_0        
        //   315: getfield        cox.d:Lcof;
        //   318: getfield        cof.d:Landroidx/work/impl/WorkDatabase;
        //   321: invokevirtual   androidx/work/impl/WorkDatabase.t:()Lcqr;
        //   324: aload           8
        //   326: invokeinterface cqr.a:(Lcqq;)V
        //   331: aload_0        
        //   332: aload           6
        //   334: iload_3        
        //   335: invokevirtual   cox.e:(Lcrh;I)V
        //   338: aload           5
        //   340: invokevirtual   cft.n:()V
        //   343: aload           5
        //   345: invokevirtual   cft.l:()V
        //   348: iinc            2, 1
        //   351: goto            27
        //   354: astore_1       
        //   355: aload           5
        //   357: invokevirtual   cft.l:()V
        //   360: aload_1        
        //   361: athrow         
        //   362: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  43     60     354    362    Any
        //  65     129    354    362    Any
        //  132    205    354    362    Any
        //  208    227    354    362    Any
        //  232    238    354    362    Any
        //  241    301    354    362    Any
        //  306    331    354    362    Any
        //  331    343    354    362    Any
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
    
    public final void e(crh ex, int size) {
        final cow e = this.e;
        final cmf k = ((crh)ex).k;
        final PersistableBundle extras = new PersistableBundle();
        extras.putString("EXTRA_WORK_SPEC_ID", ((crh)ex).c);
        extras.putInt("EXTRA_WORK_SPEC_GENERATION", ((crh)ex).s);
        extras.putBoolean("EXTRA_IS_PERIODIC", ((crh)ex).e());
        final JobInfo$Builder setExtras = new JobInfo$Builder(size, e.a).setRequiresCharging(k.b).setRequiresDeviceIdle(k.c).setExtras(extras);
        final int i = k.i;
        if (Build$VERSION.SDK_INT >= 30 && i == 6) {
            setExtras.setRequiredNetwork(new NetworkRequest$Builder().addCapability(25).build());
        }
        else {
            final int n = i - 1;
            int requiredNetworkType = 0;
            Label_0204: {
                if (n != 0) {
                    if (n != 1) {
                        if (n == 2) {
                            requiredNetworkType = 2;
                            break Label_0204;
                        }
                        if (n == 3) {
                            requiredNetworkType = 3;
                            break Label_0204;
                        }
                        requiredNetworkType = 4;
                        if (n == 4) {
                            break Label_0204;
                        }
                        cms.a();
                        cll.f(i);
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
            if (((crh)ex).u == 2) {
                n2 = 0;
            }
            else {
                n2 = 1;
            }
            setExtras.setBackoffCriteria(((crh)ex).m, n2);
        }
        final long max = Math.max(((crh)ex).a() - System.currentTimeMillis(), 0L);
        if (Build$VERSION.SDK_INT <= 28) {
            setExtras.setMinimumLatency(max);
        }
        else if (max > 0L) {
            setExtras.setMinimumLatency(max);
        }
        else if (!((crh)ex).q) {
            setExtras.setImportantWhileForeground(true);
        }
        if (k.a()) {
            for (final cme cme : k.h) {
                setExtras.addTriggerContentUri(new JobInfo$TriggerContentUri(cme.a, (int)(cme.b ? 1 : 0)));
            }
            setExtras.setTriggerContentUpdateDelay(k.f);
            setExtras.setTriggerContentMaxDelay(k.g);
        }
        setExtras.setPersisted(false);
        setExtras.setRequiresBatteryNotLow(k.d);
        setExtras.setRequiresStorageNotLow(k.e);
        final int l = ((crh)ex).l;
        if (Build$VERSION.SDK_INT >= 31 && ((crh)ex).q && l <= 0 && max <= 0L) {
            setExtras.setExpedited(true);
        }
        final JobInfo build = setExtras.build();
        cms.a();
        final String c = ((crh)ex).c;
        try {
            if (this.c.schedule(build) == 0) {
                cms.a();
                final String a = cox.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to schedule work ID ");
                sb.append(((crh)ex).c);
                Log.w(a, sb.toString());
                if (((crh)ex).q && ((crh)ex).v == 1) {
                    ((crh)ex).q = false;
                    String.format("Scheduling a non-expedited job (work ID %s)", ((crh)ex).c);
                    cms.a();
                    this.e((crh)ex, size);
                }
            }
        }
        catch (IllegalStateException ex) {
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
            cms.a();
            Log.e(cox.a, format);
            ex = new IllegalStateException(format, ex);
            final ako f = this.d.c.f;
            throw ex;
        }
        finally {
            cms.a();
            final String a2 = cox.a;
            new StringBuilder("Unable to schedule ").append(ex);
            final Throwable t;
            Log.e(a2, "Unable to schedule ".concat(String.valueOf(ex)), t);
        }
    }
}
