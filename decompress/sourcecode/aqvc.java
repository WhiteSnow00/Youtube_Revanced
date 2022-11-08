import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvc extends agzi implements ahax
{
    public static final aqvc a;
    private static volatile ahbe c;
    public agzy b;
    private byte d;
    
    static {
        agzi.registerDefaultInstance(aqvc.class, a = new aqvc());
    }
    
    private aqvc() {
        this.d = 2;
        this.b = agzi.emptyProtobufList();
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
                final ahbe c;
                if ((c = aqvc.c) == null) {
                    synchronized (aqvc.class) {
                        if (aqvc.c == null) {
                            aqvc.c = (ahbe)new agzb((agzi)aqvc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqvc.a;
            }
            case 4: {
                return new agza((short[])null, (short[])null);
            }
            case 3: {
                return new aqvc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqvc.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", aqvb.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.d = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
