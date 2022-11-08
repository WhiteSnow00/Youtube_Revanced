import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class appp extends agzi implements ahax
{
    public static final appp a;
    private static volatile ahbe d;
    public int b;
    public appg c;
    private ahfw e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance((Class)appp.class, (agzi)(a = new appp()));
    }
    
    private appp() {
        this.f = 2;
        final agyc b = agyc.b;
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
                final ahbe d;
                if ((d = appp.d) == null) {
                    synchronized (appp.class) {
                        if (appp.d == null) {
                            appp.d = (ahbe)new agzb((agzi)appp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return appp.a;
            }
            case 4: {
                return new agza((agzi)appp.a);
            }
            case 3: {
                return new appp();
            }
            case 2: {
                return newMessageInfo((MessageLite)appp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
