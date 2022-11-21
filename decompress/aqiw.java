import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqiw extends ahcz implements aheo
{
    public static final aqiw a;
    private static volatile ahev d;
    public ahdp b;
    public ahdp c;
    
    static {
        ahcz.registerDefaultInstance(aqiw.class, a = new aqiw());
    }
    
    private aqiw() {
        this.b = ahcz.emptyProtobufList();
        this.c = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aqiw.d) == null) {
                    synchronized (aqiw.class) {
                        if (aqiw.d == null) {
                            aqiw.d = (ahev)new ahcs((ahcz)aqiw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqiw.a;
            }
            case 4: {
                return new ahcr((ahcz)aqiw.a);
            }
            case 3: {
                return new aqiw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqiw.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[] { "b", aqix.class, "c", aqiy.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
