import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknm extends agzi implements ahax
{
    public static final aknm a;
    private static volatile ahbe d;
    public int b;
    public agzy c;
    private int e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(aknm.class, a = new aknm());
    }
    
    private aknm() {
        this.f = 2;
        this.c = agzi.emptyProtobufList();
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
                final ahbe d;
                if ((d = aknm.d) == null) {
                    synchronized (aknm.class) {
                        if (aknm.d == null) {
                            aknm.d = (ahbe)new agzb((agzi)aknm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aknm.a;
            }
            case 4: {
                return new agza((agzi)aknm.a);
            }
            case 3: {
                return new aknm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aknm.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001\u100c\u0000\u0003\u041b", new Object[] { "e", "b", akhl.o, "c", aknk.class });
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
