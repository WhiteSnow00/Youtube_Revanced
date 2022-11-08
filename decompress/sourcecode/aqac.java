import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqac extends agzi implements ahax
{
    public static final aqac a;
    private static volatile ahbe c;
    public agzy b;
    private byte d;
    
    static {
        agzi.registerDefaultInstance(aqac.class, a = new aqac());
    }
    
    private aqac() {
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
                if ((c = aqac.c) == null) {
                    synchronized (aqac.class) {
                        if (aqac.c == null) {
                            aqac.c = (ahbe)new agzb((agzi)aqac.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqac.a;
            }
            case 4: {
                return new agza((agzi)aqac.a);
            }
            case 3: {
                return new aqac();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqac.a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002\u041b", new Object[] { "b", aqaf.class });
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
