import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alib extends agzd implements agze
{
    public static final alib a;
    public static final agzg b;
    private static volatile ahbe o;
    public int c;
    public alhz d;
    public agzy e;
    public agzy f;
    public String g;
    public alhx h;
    public String i;
    public boolean j;
    public ajkm k;
    public int m;
    public agyc n;
    private ahfw p;
    private byte q;
    
    static {
        final alib a2 = new alib();
        agzi.registerDefaultInstance((Class)alib.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)ansr.a, (Object)a2, (MessageLite)a2, (agzn)null, 50195462, ahcm.k, (Class)alib.class);
    }
    
    private alib() {
        this.q = 2;
        this.e = emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = "";
        this.i = "";
        this.n = agyc.b;
    }
    
    public final void a() {
        final agzy e = this.e;
        if (!e.c()) {
            this.e = agzi.mutableCopy(e);
        }
    }
    
    public final void d() {
        final agzy f = this.f;
        if (!f.c()) {
            this.f = agzi.mutableCopy(f);
        }
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe o3;
                if ((o3 = alib.o) == null) {
                    synchronized (alib.class) {
                        if (alib.o == null) {
                            alib.o = (ahbe)new agzb((agzi)alib.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return alib.a;
            }
            case 4: {
                return new agzc(alib.a);
            }
            case 3: {
                return new alib();
            }
            case 2: {
                return newMessageInfo((MessageLite)alib.a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0002\u0004\u0001\u041b\u0002\u041b\u0003\u1409\t\u0004\u100a\n\u0005\u1409\u0000\u0006\u1009\u0002\u0007\u1008\u0003\b\u1007\u0004\t\u100b\u0006\n\u1009\u0005\r\u1008\u0001", new Object[] { "c", "e", alie.class, "f", alid.class, "p", "n", "d", "h", "i", "j", "m", "k", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.q = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
