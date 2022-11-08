import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akph extends agzi implements ahax
{
    public static final akph a;
    private static volatile ahbe f;
    public int b;
    public int c;
    public Object d;
    public akjd e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(akph.class, a = new akph());
    }
    
    private akph() {
        this.c = 0;
        this.g = 2;
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
                if ((f = akph.f) == null) {
                    synchronized (akph.class) {
                        if (akph.f == null) {
                            akph.f = (ahbe)new agzb((agzi)akph.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akph.a;
            }
            case 4: {
                return new agza((agzi)akph.a);
            }
            case 3: {
                return new akph();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akph.a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u143c\u0000\u0004\u103c\u0000", new Object[] { "d", "c", "b", "e", ajyn.class, ajyo.class });
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
