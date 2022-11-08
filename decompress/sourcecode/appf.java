import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class appf extends agzi implements ahax
{
    public static final appf a;
    private static volatile ahbe h;
    public int b;
    public ajsq c;
    public aioe d;
    public agzy e;
    public appj f;
    public agyc g;
    private ajsq i;
    private ahfw j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance((Class)appf.class, (agzi)(a = new appf()));
    }
    
    private appf() {
        this.k = 2;
        this.e = emptyProtobufList();
        this.g = agyc.b;
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
                final ahbe h;
                if ((h = appf.h) == null) {
                    synchronized (appf.class) {
                        if (appf.h == null) {
                            appf.h = (ahbe)new agzb((agzi)appf.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return appf.a;
            }
            case 4: {
                return new agza((agzi)appf.a);
            }
            case 3: {
                return new appf();
            }
            case 2: {
                return newMessageInfo((MessageLite)appf.a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\t\u100a\u0007", new Object[] { "b", "c", "d", "e", appe.class, "f", "i", "j", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
