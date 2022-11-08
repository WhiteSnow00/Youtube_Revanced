import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aova extends agzd implements agze
{
    public static final aova a;
    public static final agzg b;
    private static volatile ahbe r;
    public int c;
    public String d;
    public int e;
    public agzy f;
    public int g;
    public agzy h;
    public String i;
    public long j;
    public int k;
    public String m;
    public agzy n;
    public int o;
    public boolean p;
    public boolean q;
    private byte s;
    
    static {
        final aova a2 = new aova();
        agzi.registerDefaultInstance(aova.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, a2, (MessageLite)a2, null, 120, ahcm.k, aova.class);
    }
    
    private aova() {
        this.s = 2;
        this.d = "";
        this.f = emptyProtobufList();
        this.h = agzi.emptyProtobufList();
        this.i = "";
        this.m = "";
        this.n = agzi.emptyProtobufList();
    }
    
    public final void a() {
        final agzy h = this.h;
        if (!h.c()) {
            this.h = agzi.mutableCopy(h);
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
                final ahbe r;
                if ((r = aova.r) == null) {
                    synchronized (aova.class) {
                        if (aova.r == null) {
                            aova.r = (ahbe)new agzb((agzi)aova.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return aova.a;
            }
            case 4: {
                return new agzc((agzd)aova.a);
            }
            case 3: {
                return new aova();
            }
            case 2: {
                return newMessageInfo((MessageLite)aova.a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0003\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u001b\u0004\u100c\u0002\u0005\u001a\u0006\u1008\u0003\u0007\u1002\u0004\b\u100c\u0005\t\u1008\u0006\n\u001a\u000b\u1004\u0007\f\u1007\b\r\u1007\t", new Object[] { "c", "d", "e", aouv.a(), "f", aojk.class, "g", aouw.a(), "h", "i", "j", "k", amuv.a(), "m", "n", "o", "p", "q" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.s = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
