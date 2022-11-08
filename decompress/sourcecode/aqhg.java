import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhg extends agzi implements ahax
{
    public static final aqhg a;
    private static volatile ahbe d;
    public agzy b;
    public agzy c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aqhg.class, (agzi)(a = new aqhg()));
    }
    
    private aqhg() {
        this.e = 2;
        this.b = agzi.emptyProtobufList();
        this.c = emptyProtobufList();
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
                if ((d = aqhg.d) == null) {
                    synchronized (aqhg.class) {
                        if (aqhg.d == null) {
                            aqhg.d = (ahbe)new agzb((agzi)aqhg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqhg.a;
            }
            case 4: {
                return new agza((float[][])null, (byte[][])null);
            }
            case 3: {
                return new aqhg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhg.a, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0002\u0001\u0002\u001a\u0003\u041b", new Object[] { "b", "c", anlt.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
