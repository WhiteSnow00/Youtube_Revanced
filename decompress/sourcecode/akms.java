import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akms extends agzi implements ahax
{
    public static final akms a;
    private static volatile ahbe f;
    public int b;
    public akjd c;
    public agzy d;
    public agzy e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(akms.class, a = new akms());
    }
    
    private akms() {
        this.g = 2;
        this.d = agzi.emptyProtobufList();
        this.e = agzi.emptyProtobufList();
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
                final ahbe f;
                if ((f = akms.f) == null) {
                    synchronized (akms.class) {
                        if (akms.f == null) {
                            akms.f = (ahbe)new agzb((agzi)akms.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akms.a;
            }
            case 4: {
                return new agza((boolean[][])null, (boolean[])null);
            }
            case 3: {
                return new akms();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akms.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001\u1409\u0000\u0002\u001a\u0003\u001a", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
