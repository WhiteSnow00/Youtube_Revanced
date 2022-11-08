import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajet extends agzi implements ahax
{
    public static final ajet a;
    private static volatile ahbe f;
    public int b;
    public agzy c;
    public agzy d;
    public int e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(ajet.class, a = new ajet());
    }
    
    private ajet() {
        this.g = 2;
        this.c = agzi.emptyProtobufList();
        this.d = agzi.emptyProtobufList();
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
                if ((f = ajet.f) == null) {
                    synchronized (ajet.class) {
                        if (ajet.f == null) {
                            ajet.f = (ahbe)new agzb((agzi)ajet.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajet.a;
            }
            case 4: {
                return new agza((char[])null, (char[][][])null);
            }
            case 3: {
                return new ajet();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajet.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001\u041b\u0002\u041b\u0003\u100c\u0000", new Object[] { "b", "c", aorm.class, "d", aorm.class, "e", apwq.a() });
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
