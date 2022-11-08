import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiah extends agzi implements ahax
{
    public static final aiah a;
    private static volatile ahbe i;
    public int b;
    public int c;
    public Object d;
    public agzy e;
    public anss f;
    public anss g;
    public agyc h;
    private ahlm j;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance(aiah.class, a = new aiah());
    }
    
    private aiah() {
        this.c = 0;
        this.l = 2;
        emptyProtobufList();
        this.e = agzi.emptyProtobufList();
        emptyProtobufList();
        this.h = agyc.b;
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
                final ahbe i;
                if ((i = aiah.i) == null) {
                    synchronized (aiah.class) {
                        if (aiah.i == null) {
                            aiah.i = (ahbe)new agzb((agzi)aiah.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aiah.a;
            }
            case 4: {
                return new agza((agzi)aiah.a);
            }
            case 3: {
                return new aiah();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiah.a, "\u0001\b\u0001\u0001\u0007\u0014\b\u0000\u0001\u0007\u0007\u1409\u0007\b\u143c\u0000\n\u041b\r\u1409\f\u000e\u1409\r\u000f\u1409\u000e\u0010\u100a\u000f\u0014\u143c\u0000", new Object[] { "d", "c", "b", "j", ahlm.class, "e", aioe.class, "f", "g", "k", "h", anss.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
