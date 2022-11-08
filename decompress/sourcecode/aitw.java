import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitw extends agzi implements ahax
{
    public static final aitw a;
    private static volatile ahbe m;
    public int b;
    public ajsq c;
    public aoew d;
    public agzy e;
    public aioe f;
    public ajsq g;
    public ajsq h;
    public ahyq i;
    public amer j;
    public alvn k;
    public agyc l;
    private ahfw n;
    private byte o;
    
    static {
        agzi.registerDefaultInstance(aitw.class, a = new aitw());
    }
    
    private aitw() {
        this.o = 2;
        this.e = agzi.emptyProtobufList();
        this.l = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe m;
                if ((m = aitw.m) == null) {
                    synchronized (aitw.class) {
                        if (aitw.m == null) {
                            aitw.m = (ahbe)new agzb((agzi)aitw.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aitw.a;
            }
            case 4: {
                return new agza((agzi)aitw.a);
            }
            case 3: {
                return new aitw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aitw.a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\t\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\t\u1409\b\n\u100a\t\u000b\u041b\r\u1009\u0007", new Object[] { "b", "c", "d", "f", "g", "h", "i", "j", "n", "l", "e", aora.class, "k" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.o = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
