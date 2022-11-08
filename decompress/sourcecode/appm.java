import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appm extends agzi implements ahax
{
    public static final appm a;
    private static volatile ahbe p;
    public int b;
    public int c;
    public Object d;
    public int e;
    public Object f;
    public ajsq g;
    public aioe h;
    public anss i;
    public agzy j;
    public apor k;
    public apor l;
    public anss m;
    public int n;
    public agyc o;
    private ahfw q;
    private byte r;
    
    static {
        agzi.registerDefaultInstance((Class)appm.class, (agzi)(a = new appm()));
    }
    
    private appm() {
        this.c = 0;
        this.e = 0;
        this.r = 2;
        this.j = emptyProtobufList();
        emptyProtobufList();
        this.o = agyc.b;
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
                final ahbe p3;
                if ((p3 = appm.p) == null) {
                    synchronized (appm.class) {
                        if (appm.p == null) {
                            appm.p = (ahbe)new agzb((agzi)appm.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return appm.a;
            }
            case 4: {
                return new agza((agzi)appm.a);
            }
            case 3: {
                return new appm();
            }
            case 2: {
                return newMessageInfo((MessageLite)appm.a, "\u0001\u000f\u0002\u0001\u0001\u000f\u000f\u0000\u0001\u000b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u143c\u0000\u0004\u041b\u0005\u143c\u0001\u0006\u1009\b\u0007\u1409\f\b\u100a\r\t\u143c\u0001\n\u143c\u0001\u000b\u1409\n\f\u1409\u0002\r\u1009\t\u000e\u143c\u0001\u000f\u100c\u000b", new Object[] { "d", "c", "f", "e", "b", "g", "h", ajsq.class, "j", apoy.class, aorm.class, "k", "q", "o", ajsq.class, aibc.class, "m", "i", "l", anss.class, "n", apms.q });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.r = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
