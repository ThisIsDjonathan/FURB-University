
package Controle.generico;

/**
 *
 * @author Tamires, Djonathan Krause
 */
public interface ParserConstants
{
    int START_SYMBOL = 43;

    int FIRST_NON_TERMINAL    = 43;
    int FIRST_SEMANTIC_ACTION = 90;

    int[][] PARSER_TABLE =
    {
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,  9, -1, -1, -1, -1, -1, 10, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1,  1,  1,  1,  1, -1, -1, -1, -1, -1,  1,  1, -1, -1, -1, -1, -1, -1, -1,  1,  1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1,  5,  5,  5,  5, -1, -1, -1, -1, -1,  7,  4, -1, -1, -1, -1, -1, -1, -1,  6,  8, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 11, 11, 11, 11, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 12, 12, 12, 12, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 15, 15, 15, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 18, 19, 20, 21, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, 22, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 23, 23, 23, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 24, 24, 24, 24, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 27, 28, 29, 30, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 32, 32, 32, 32, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 35, 35, 35, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 39, 39, 39, 39, 39, 39, 39, -1, 39, -1, -1, -1, -1, -1, -1, 39, -1, 39, -1, -1, -1, -1, -1, -1, -1, 39, -1, -1, -1, 39, 39, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 42, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 44, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 45, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 46, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 48, 48, 48, 48, -1, -1, -1, -1, -1, 48, 48, -1, 47, -1, -1, -1, -1, -1, 48, 48, -1, -1, -1, -1, -1, -1, -1, -1, 48, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 50, 50, 50, 50, -1, -1, -1, -1, -1, 50, 50, 49, -1, -1, -1, -1, -1, -1, 50, 50, -1, -1, -1, -1, -1, -1, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 51, 51, 51, 51, -1, -1, -1, -1, -1, 51, 51, -1, -1, -1, -1, -1, -1, -1, 51, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 54, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 56, 55, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 57, 57, 57, 57, 57, 57, 57, -1, 57, -1, -1, -1, -1, -1, -1, 57, -1, 57, -1, -1, -1, -1, -1, -1, -1, 57, -1, -1, -1, 57, 57, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1,  3,  3,  3,  3, -1, -1, -1, -1, -1,  3,  3, -1, -1, -1, -1, -1, -1, -1,  3,  3, -1, -1, -1, -1, -1, -1, -1, -1,  2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 14, -1, 13, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 16, -1, 16, 17, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, -1, -1, -1, -1, -1, -1, -1, -1, -1, 25, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 34, -1, -1, -1, -1, -1, 33, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, 37, -1, -1, 36, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 41, -1, -1, -1, -1, -1, 40, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 53, 53, 53, 53, -1, -1, -1, -1, -1, 53, 53, -1, -1, -1, -1, -1, -1, -1, 53, 53, -1, -1, -1, -1, -1, -1, -1, -1, 52, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 61, 61, 61, 61, 61, 61, 61, -1, 63, -1, -1, -1, -1, -1, -1, 64, -1, 62, -1, -1, -1, -1, -1, -1, -1, 61, -1, -1, -1, 61, 61, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 65, 65, 65, 65, 65, 65, 65, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 65, -1, -1, -1, 65, 65, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 68, 69, 70, 71, 72, 73 },
        { -1, -1, 74, 74, 74, 74, 74, 74, 74, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 74, -1, -1, -1, 74, 74, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 78, 78, 78, 78, 78, 78, 78, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 78, -1, -1, -1, 78, 78, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, 82, 82, 82, 82, 83, 84, 85, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 86, -1, -1, -1, 87, 88, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, 93, -1, -1, -1, -1, -1, -1, -1, -1, 93, -1, -1, -1, 93, -1, 93, 94, 93, -1, 93, -1, -1, 93, 93, 93, 93, -1, 93, 93, 93, 93, 93, 93 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, 58, -1, -1, -1, -1, -1, -1, -1, -1, 59, -1, -1, -1, 60, -1, 60, -1, 60, -1, 60, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, 77, -1, -1, -1, -1, -1, -1, -1, -1, 77, -1, -1, -1, 77, -1, 77, -1, 77, -1, 77, -1, -1, 75, 76, -1, -1, -1, 77, 77, 77, 77, 77, 77 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, 81, -1, -1, -1, -1, -1, -1, -1, -1, 81, -1, -1, -1, 81, -1, 81, -1, 81, -1, 81, -1, -1, 81, 81, 79, 80, -1, 81, 81, 81, 81, 81, 81 },
        { -1, -1, -1, -1, -1, -1, -1, -1, -1, 67, -1, -1, -1, -1, -1, -1, -1, -1, 67, -1, -1, -1, 67, -1, 67, -1, 67, -1, 67, -1, -1, -1, -1, -1, -1, -1, 66, 66, 66, 66, 66, 66 },
        { -1, -1, 89, 90, 91, 92, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
    };

    int[][] PRODUCTIONS = 
    {
        { 102,  16,  17,  44,  30,  45,  31, 103 },
        {  46,  70 },
        {   0 },
        {  45 },
        {  55 },
        {  52 },
        {  58 },
        {  60 },
        {  67 },
        {  24,  47,  25 },
        {   0 },
        {  48 },
        {  49,  71 },
        {   0 },
        {  23,  48 },
        {  50, 111,  72, 112 },
        {   0 },
        {  26,  51, 116,  27 },
        {   3 },
        {   4 },
        {   5 },
        {   6 },
        {   7 },
        {  53,  36,  69, 115,  25 },
        {  54, 111, 127,  73 },
        {   0 },
        { 117,  26,  69,  27 },
        {   3 },
        {   4 },
        {   5 },
        {   6 },
        {  13,  28,  56,  29,  25 },
        {  57,  74 },
        {   0 },
        {  23,  56 },
        {  50, 111, 125,  75, 113 },
        {   0 },
        { 117,  26,  69,  27 },
        {  21,  28,  59,  29,  25 },
        {  69, 101,  76 },
        {   0 },
        {  23,  59 },
        {  12,  28,  69, 124,  29,  61 },
        {  62,  65, 119 },
        {  63,  64, 119 },
        {  15, 118,  24,  30,  66,  31 },
        {  14, 118,  24,  30,  66,  31 },
        {  62 },
        {   0 },
        {  63 },
        {   0 },
        {  46,  77 },
        {   0 },
        {  66 },
        { 121,  22,  28,  69, 124,  29,  68, 122,  24,  30,  66,  31, 123 },
        {  15 },
        {  14 },
        {  78,  85, 126 },
        {  10,  78, 104,  85 },
        {  19,  78, 105,  85 },
        {   0 },
        {  79 },
        {  20, 106 },
        {  11, 107 },
        {  18,  78, 108 },
        {  81,  88 },
        {  80, 100,  81,  99 },
        {   0 },
        {  37 },
        {  38 },
        {  39 },
        {  40 },
        {  41 },
        {  42 },
        {  82,  86 },
        {  32,  82,  91,  86 },
        {  33,  82,  92,  86 },
        {   0 },
        {  83,  87 },
        {  34,  83,  93,  87 },
        {  35,  83,  94,  87 },
        {   0 },
        {  89, 111,  84, 114 },
        {   7,  95 },
        {   8,  96 },
        {   9, 109 },
        {  28,  69,  29 },
        {  32,  83,  97 },
        {  33,  83,  98 },
        {   3 },
        {   4 },
        {   5 },
        {   6 },
        {   0 },
        { 120,  26,  69,  27 }
    };

    String[] PARSER_ERROR =
    {
        "",
        " fim de programa",
        " palavra_reservada",
        " identificador",
        " identificador",
        " identificador",
        " identificador",
        " constante_int",
        " constante_float",
        " constante_string",
        " and",
        " false",
        " if",
        " in",
        " isFalseDo",
        " isTrueDo",
        " main",
        " module",
        " not",
        " or",
        " true",
        " out",
        " while",
        " \",\"",
        " \":\"",
        " \";\"",
        " \"[\"",
        " \"]\"",
        " \"(\"",
        " \")\"",
        " \"{\"",
        " \"}\"",
        " \"+\"",
        " \"-\"",
        " \"*\"",
        " \"/\"",
        " \"<-\"",
        " \"=\"",
        " \"!=\"",
        " \"<\"",
        " \"<=\"",
        " \">\"",
        " \">=\"",
        "main", //"<programa> inválido ",
        " : {", //"<variaveis> inválido",
        " comando",//<aux_comando> inválido",
        " comando", //<comando> inválido",
        " identificador", //<var> inválido",
        " , ;", //<lista_de_variaveis> inválido",
        " identificador", //<id1> inválido",
        " identificador", //<tipo> inválido",
        " constante int", //<numero> inválido",
        " identificador", //<atribuicao> inválido",
        " identificador", //<aux_id> inválido",
        " , ; [", //<id2> inválido",
        " in", //<entrada> inválido",
        " identificador", //<lista_identificadores> inválido",
        " identificador", //<id3> inválido",
        " out", //<saida> inválido",
        " expressão", //<lista_expressao> inválido",
        " if", //<selecao> inválido",
        " isTrueDo isFalseDo", //<tipo_selecao> inválido",
        " isTrueDo", //<true> inválido",
        " isFalseDo", //<false> inválido",
        " comando isTrueDo }", // <trueF> inválido",
        " comando isFalseDo }", //<falseT> inválido",
        " comando", //<lista_comandos> inválido",
        " while", //<repeticao> inválido",
        " isFalseDo isTrueDo", //<tipo_rep> inválido",
        " expressao", // <expressao> inválido",
        " comando }", //<aux_comando1> inválido",
        " . ;", //<lista_de_variaveis1> inválido",
        " . ; [", //<id12> inválido",
        " [ <-", //<aux_id1> inválido",
        " , )", //<lista_identificadores1> inválido",
        " , [ )", //<id32> inválido",
        " , )", //<lista_expressao1> inválido",
        " comando }", //<lista_comandos1> inválido",
        " expressão", //<elemento> inválido",
        " expressão", //<relacional> inválido",
        " expressão", //<operador_relacional> inválido",
        " expressão", //<aritmetica> inválido",
        " expressão", //<termo> inválido",
        " expressão", //<fator> inválido",
        " , ; [ ] ) operador binário (aritmético, lógico, relacional)", //<vetor_uso> inválido",
        " and or , ; ] )", //<expressao1> inválido",
        " expressão", //<aritmetica1> inválido",
        " expressão", //<termo1> inválido",
        " expressão", //<relacional1> inválido",
        " identificador", //<identificador_variavel> inválido"
    };
}

