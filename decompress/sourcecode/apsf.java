import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsf extends agzi implements ahax
{
    public static final apsf a;
    private static volatile ahbe f;
    public int b;
    public agzy c;
    public agzy d;
    public aioe e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)apsf.class, (agzi)(a = new apsf()));
    }
    
    private apsf() {
        this.g = 2;
        this.c = agzi.emptyProtobufList();
        this.d = agzi.emptyProtobufList();
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
                final ahbe f;
                if ((f = apsf.f) == null) {
                    synchronized (apsf.class) {
                        if (apsf.f == null) {
                            apsf.f = (ahbe)new agzb((agzi)apsf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apsf.a;
            }
            case 4: {
                return new agza((agzi)apsf.a);
            }
            case 3: {
                return new apsf();
            }
            case 2: {
                return newMessageInfo((MessageLite)apsf.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0001\u0001\u001a\u0002\u1409\u0000\u0004\u001a", new Object[] { "b", "c", "e", "d" });
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
