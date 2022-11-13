import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$GestureOptions;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdz extends ahbc implements ahbd
{
    public static final aqdz a;
    private static volatile ahdd i;
    public int b;
    public int c;
    public int d;
    public CommandOuterClass$Command e;
    public CommandOuterClass$Command f;
    public CommandOuterClass$GestureOptions g;
    public CommandOuterClass$GestureOptions h;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aqdz.class, (ahbh)(a = new aqdz()));
    }
    
    private aqdz() {
        this.j = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = aqdz.i) == null) {
                    synchronized (aqdz.class) {
                        if (aqdz.i == null) {
                            aqdz.i = (ahdd)new ahba((ahbh)aqdz.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aqdz.a;
            }
            case 4: {
                return new ahbb((ahbc)aqdz.a);
            }
            case 3: {
                return new aqdz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqdz.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001\u100b\u0000\u0002\u100b\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1009\u0004\u0006\u1009\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
