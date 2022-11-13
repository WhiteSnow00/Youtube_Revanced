import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiha extends ahbh implements ahcw
{
    public static final aiha a;
    private static volatile ahdd i;
    public int b;
    public String c;
    public String d;
    public boolean e;
    public CommandOuterClass$Command f;
    public boolean g;
    public int h;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aiha.class, (ahbh)(a = new aiha()));
    }
    
    private aiha() {
        this.j = 2;
        this.c = "";
        this.d = "";
        this.h = 1;
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
                if ((i = aiha.i) == null) {
                    synchronized (aiha.class) {
                        if (aiha.i == null) {
                            aiha.i = (ahdd)new ahba((ahbh)aiha.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aiha.a;
            }
            case 4: {
                return new ahaz((ahbh)aiha.a);
            }
            case 3: {
                return new aiha();
            }
            case 2: {
                return newMessageInfo((MessageLite)aiha.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u1409\u0003\u0005\u100c\u0005\u0007\u1007\u0004", new Object[] { "b", "c", "d", "e", "f", "h", aihb.a(), "g" });
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
