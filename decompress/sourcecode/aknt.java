import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknt extends agzi implements ahax
{
    public static final aknt a;
    private static volatile ahbe f;
    public int b;
    public akjd c;
    public apjb d;
    public String e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aknt.class, a = new aknt());
    }
    
    private aknt() {
        this.g = 2;
        this.e = "";
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
                if ((f = aknt.f) == null) {
                    synchronized (aknt.class) {
                        if (aknt.f == null) {
                            aknt.f = (ahbe)new agzb((agzi)aknt.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aknt.a;
            }
            case 4: {
                return new agza((agzi)aknt.a);
            }
            case 3: {
                return new aknt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aknt.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
