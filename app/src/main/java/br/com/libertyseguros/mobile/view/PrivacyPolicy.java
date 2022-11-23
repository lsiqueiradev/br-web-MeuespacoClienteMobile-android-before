package br.com.libertyseguros.mobile.view;


import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import br.com.libertyseguros.mobile.BuildConfig;
import br.com.libertyseguros.mobile.R;
import br.com.libertyseguros.mobile.libray.Config;
import br.com.libertyseguros.mobile.view.baseActivity.BaseActionBar;

public class PrivacyPolicy extends BaseActionBar{

    private WebView webView;


    public void onCreate(Bundle bundle){
        super.onCreate(bundle);

        setContentView(R.layout.activity_privacy_policy);

        setTitle(getResources().getString(R.string.title_action_bar_12));


        webView = (WebView) findViewById(R.id.wv_privacy);
        WebSettings settings = webView.getSettings();
        settings.setDefaultTextEncodingName("utf-8");
        String html = "<html><head><meta http-equiv=Content-Type content=\"text/html; charset=windows-1252\">  " +
                "<style> <!--  /* Font Definitions */  @font-face \t{font-family:Wingdings; \tpanose-1:5 0 0 0 0 0 0 0 0 0;} " +
                "@font-face \t{font-family:\"Cambria Math\"; \tpanose-1:2 4 5 3 5 4 6 3 2 4;} @font-face \t{font-family:Calibri; " +
                "\tpanose-1:2 15 5 2 2 2 4 3 2 4;} @font-face \t{font-family:\"Segoe UI\"; \tpanose-1:2 11 5 2 4 2 4 2 2 3;}" +
                " @font-face \t{font-family:Verdana; \tpanose-1:2 11 6 4 3 5 4 4 2 4;}  /* Style Definitions */  p.MsoNormal, " +
                "li.MsoNormal, div.MsoNormal \t{margin-top:0cm; \tmargin-right:0cm; \tmargin-bottom:8.0pt; \tmargin-left:0cm; " +
                "\tline-height:107%; \tfont-size:11.0pt; \tfont-family:\"Calibri\",sans-serif;} h3 \t{mso-style-link:\"Título 3 Char\"; " +
                "\tmargin-right:0cm; \tmargin-left:0cm; \tfont-size:13.5pt; \tfont-family:\"Times New Roman\",serif; \tfont-weight:bold;}" +
                " h5 \t{mso-style-link:\"Título 5 Char\"; \tmargin-top:2.0pt; \tmargin-right:0cm; \tmargin-bottom:0cm; \tmargin-left:0cm;" +
                " \tmargin-bottom:.0001pt; \tline-height:107%; \tpage-break-after:avoid; \tfont-size:11.0pt; " +
                "\tfont-family:\"Calibri Light\",sans-serif; \tcolor:#2E74B5; \tfont-weight:normal;} p.MsoCommentText, " +
                "li.MsoCommentText, div.MsoCommentText \t{mso-style-link:\"Texto de comentário Char\"; \tmargin-top:0cm;" +
                " \tmargin-right:0cm; \tmargin-bottom:8.0pt; \tmargin-left:0cm; \tfont-size:10.0pt; \tfont-family:\"Calibri\",sans-serif;} " +
                "a:link, span.MsoHyperlink \t{color:blue; \ttext-decoration:underline;} a:visited, span.MsoHyperlinkFollowed \t{color:#954F72; " +
                "\ttext-decoration:underline;} p \t{margin-right:0cm; \tmargin-left:0cm; \tfont-size:12.0pt; " +
                "\tfont-family:\"Times New Roman\",serif;} p.MsoCommentSubject, li.MsoCommentSubject, div.MsoCommentSubject " +
                "\t{mso-style-link:\"Assunto do comentário Char\"; \tmargin-top:0cm; \tmargin-right:0cm; \tmargin-bottom:8.0pt; " +
                "\tmargin-left:0cm; \tfont-size:10.0pt; \tfont-family:\"Calibri\",sans-serif; \tfont-weight:bold;} p.MsoAcetate," +
                " li.MsoAcetate, div.MsoAcetate \t{mso-style-link:\"Texto de balão Char\"; \tmargin:0cm; \tmargin-bottom:.0001pt;" +
                " \tfont-size:9.0pt; \tfont-family:\"Segoe UI\",sans-serif;} span.Ttulo3Char \t{mso-style-name:\"Título 3 Char\"; " +
                "\tmso-style-link:\"Título 3\"; \tfont-family:\"Times New Roman\",serif; \tfont-weight:bold;} span.Ttulo5Char " +
                "\t{mso-style-name:\"Título 5 Char\"; \tmso-style-link:\"Título 5\"; \tfont-family:\"Calibri Light\",sans-serif; " +
                "\tcolor:#2E74B5;} span.TextodebaloChar \t{mso-style-name:\"Texto de balão Char\"; \tmso-style-link:\"Texto de balão\"; " +
                "\tfont-family:\"Segoe UI\",sans-serif;} span.TextodecomentrioChar \t{mso-style-name:\"Texto de comentário Char\"; " +
                "\tmso-style-link:\"Texto de comentário\";} span.AssuntodocomentrioChar \t{mso-style-name:\"Assunto do comentário Char\"; " +
                "\tmso-style-link:\"Assunto do comentário\"; \tfont-weight:bold;} .MsoChpDefault \t{font-family:\"Calibri\",sans-serif;} " +
                ".MsoPapDefault \t{margin-bottom:8.0pt; \tline-height:107%;} @page WordSection1 \t{size:595.3pt 841.9pt; " +
                "\tmargin:70.85pt 3.0cm 70.85pt 3.0cm;} div.WordSection1 \t{page:WordSection1;}  /* List Definitions */  ol " +
                "\t{margin-bottom:0cm;} ul \t{margin-bottom:0cm;} --> </style>  </head>  <body lang=PT-BR link=blue vlink=\"#954F72\"> " +
                "<div class=WordSection1>  <p class=MsoNormal style='text-align:justify'><span style='font-size:15.0pt; line-height:107%;" +
                "font-family:\"Arial\",sans-serif;color:#447ADD'>Termos e Condições:</span></p>  <p class=MsoNormal style='margin-top:15.0pt;" +
                "margin-right:0cm;margin-bottom: 7.5pt;margin-left:0cm;text-align:justify;line-height:16.5pt;background:white'>" +
                "<span style='font-size:15.0pt;font-family:\"Arial\",sans-serif;color:#447ADD'>" +
                "Em breve você terá acesso a informações privilegiadas, constantes na base de dados da " +
                "<span style='background:none'>Liberty Seguros S.A.</span></span></p>   <ul type=disc>   " +
                "<li class=MsoNormal style='color:#555555;margin-bottom:15.0pt;text-align:       " +
                "justify;line-height:normal;background:white'><span style='font-size:10.0pt;       " +
                "font-family:\"Arial\",sans-serif'>Não usar com propósitos ilegais os dados/informações obtidas," +
                " de qualquer forma, na base de dados do <span style='background:none'>Liberty Web</span>;</span></li>" +
                "   <li class=MsoNormal style='color:#555555;margin-bottom:15.0pt;text-align:justify;line-height:normal;background:white'>" +
                "<span style='font-size:10.0pt;       font-family:\"Arial\",sans-serif'>Não propagar vírus de computador, " +
                "programas invasivos (worms) ou outras formas de programas de computador, " +
                "auto-replicantes ou não, que causem danos permanentes ou temporários nos " +
                "equipamentos do destinatário;</span></li>   <li class=MsoNormal style='color:#555555;" +
                "margin-bottom:15.0pt;text-align:       justify;line-height:normal;background:white'>" +
                "<span style='font-size:10.0pt;       font-family:\"Arial\",sans-serif'>Não usar a " +
                "rede para tentar e/ou realizar       acesso não autorizado a dispositivos de comunicação, " +
                "informação ou       computação da <span style='background:none'>Liberty Seguros S/A;</span></span></li>   " +
                "<li class=MsoNormal style='color:#555555;margin-bottom:15.0pt;text-align: justify;" +
                "line-height:normal;background:white'><span style='font-size:10.0pt; " +
                "font-family:\"Arial\",sans-serif'>Não forjar endereços de máquinas, de rede " +
                "ou de correio eletrônico, na tentativa de responsabilizar terceiros ou ocultar a " +
                "identidade ou autoria, fazendo mal uso das informações aqui contidas;</span></li>  " +
                "<li class=MsoNormal style='color:#555555;margin-bottom:15.0pt;text-align:justify;" +
                "line-height:normal;background:white'><span style='font-size:10.0pt; font-family:\"Arial\",sans-serif'>" +
                "Não destruir ou corromper dados e informações contidas nos servidores do " +
                "<span style='background:none'>Liberty Web;</span></span></li>  <li class=MsoNormal style='color:#555555;margin-bottom:15.0pt;text-align:       justify;line-height:normal;background:white'><span style='font-size:10.0pt;       font-family:\"Arial\",sans-serif'>Não violar copyright ou direito autoral       reproduzindo, integral ou parcialmente, material contido no Site <span       style='background:none'>LW</span> sem prévia autorização da <span       style='background:none'>Liberty Seguros S/A.</span></span></li>   <li class=MsoNormal style='color:#555555;margin-bottom:15.0pt;text-align:       justify;line-height:normal;background:white'><span style='font-size:10.0pt;       font-family:\"Arial\",sans-serif'>No caso do uso de qualquer plataforma/       serviço que requeira indicação de e-mail pessoal, importante alertar que:</span></li>       <ul type=square>      <li class=MsoNormal style='color:#555555;margin-bottom:15.0pt;text-align:          justify;line-height:normal;background:white'><span style='font-size:          10.0pt;font-family:\"Arial\",sans-serif'>O seu e-mail privativo é de uso          pessoal e restrito, portanto, por questão de segurança, não          recomendamos o compartilhamento da sua conta de e-mail e sugerimos que          sempre use senha forte;</span></li>      <li class=MsoNormal style='color:#555555;margin-bottom:15.0pt;text-align:          justify;line-height:normal;background:white'><span style='font-size:          10.0pt;font-family:\"Arial\",sans-serif'>Todas as informações fornecidas          pelo usuário, é de sua responsabilidade;</span></li>      <li class=MsoNormal style='color:#555555;margin-bottom:15.0pt;text-align:          justify;line-height:normal;background:white'><span style='font-size:          10.0pt;font-family:\"Arial\",sans-serif'>A <span style='background:none'>Liberty          Seguros S/A</span> não tem responsabilidade acerca do e-mail pessoal          do usuário, cabendo a esse, administrá-lo da forma mais segura          possível.</span></li>     </ul>     <li class=MsoNormal style='color:#555555;margin-bottom:15.0pt;text-align:       justify;line-height:normal;background:white'><span style='font-size:10.0pt;       font-family:\"Arial\",sans-serif'>No caso de haver o descumprimento de       qualquer uma das regras supra mencionadas, a mesma acarretará a tomada       das medidas judiciais cabíveis, na esfera civil e penal, a fim de ver       resguardado os direitos da <span style='background:none'>LIBERTY       SEGUROS S/A.</span></span></li>  </ul>   <p class=MsoNormal style='text-align:justify'>&nbsp;</p>  <h3 style='margin-top:15.0pt;margin-right:0cm;margin-bottom:7.5pt;margin-left: 0cm;text-align:justify;line-height:16.5pt;background:white'><span style='font-size:15.0pt;font-family:\"Arial\",sans-serif;color:#447ADD; font-weight:normal'>Política de Privacidade</span></h3>  <h5 style='margin-top:7.5pt;margin-right:0cm;margin-bottom:7.5pt;margin-left: 0cm;text-align:justify;background:white'><b><span style='font-size:10.5pt; line-height:107%;font-family:\"Arial\",sans-serif;color:#447ADD'>Introdução</span></b></h5>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Bem vindo ao&nbsp;</span><a href=\"http://www.libertyseguros.com.br/\" target=\"_blank\"><span style='font-size:10.0pt;font-family:\"Verdana\",sans-serif;color:#1B407E; background:none;text-decoration:none'>Grupo</span></a><span class=MsoHyperlink><span style='font-size:10.0pt;font-family:\"Verdana\",sans-serif; color:#1B407E;background:none;text-decoration:none'> Liberty Seguros</span></span><span style='font-size:10.0pt;font-family:\"Verdana\",sans-serif;color:#555555; background:none'>.</span><span style='font-size:10.0pt;font-family:\"Verdana\",sans-serif; color:#555555'> Este site/app é de propriedade de uma das empresas do <span style='background:none'>Grupo Liberty Seguros</span>. Esta Política de Privacidade foi criada para informar como nós coletamos, utilizamos e divulgamos as informações que você nos fornece através deste site.</span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Ao utilizar este site/aplicativo, você reconhece ter analisado, e concordado, com os termos desta Política de Privacidade. Caso você não concorde com esta Política de Privacidade, favor não utilizar este site.</span></p>  <h5 style='margin-top:7.5pt;margin-right:0cm;margin-bottom:7.5pt;margin-left: 0cm;text-align:justify;background:white'><b><span style='font-size:10.5pt; line-height:107%;font-family:\"Arial\",sans-serif;color:#447ADD'>Aquisição de seus dados</span></b></h5>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Ao acessar este site/app, serão automaticamente coletadas pelo próprio site ou mobile ou ainda pelo Google Analytics (para a criação das estatísticas daquele) as seguintes informações de navegação:</span></p>  <ul type=disc>  <li class=MsoNormal style='color:#555555;text-align:justify;line-height:normal;      background:white'><span style='font-size:10.0pt;font-family:\"Verdana\",sans-serif'>Endereço      de IP – Protocolo de Internet;</span></li>  <li class=MsoNormal style='color:#555555;text-align:justify;line-height:normal;      background:white'><span style='font-size:10.0pt;font-family:\"Verdana\",sans-serif'>Tipo      de navegador e sua versão;</span></li>  <li class=MsoNormal style='color:#555555;text-align:justify;line-height:normal;      background:white'><span style='font-size:10.0pt;font-family:\"Verdana\",sans-serif'>Tipo      de sistema operacional de celular e sua versão;</span></li>  <li class=MsoNormal style='color:#555555;text-align:justify;line-height:normal;      background:white'><span style='font-size:10.0pt;font-family:\"Verdana\",sans-serif'>Número      de identificação do dispositivo (entende-se como dispositivo: celulares e      demais PDAs);</span></li>  <li class=MsoNormal style='color:#555555;text-align:justify;line-height:normal;      background:white'><span style='font-size:10.0pt;font-family:\"Verdana\",sans-serif'>Localização      do usuário;</span></li>  <li class=MsoNormal style='color:#555555;text-align:justify;line-height:normal;      background:white'><span style='font-size:10.0pt;font-family:\"Verdana\",sans-serif'>Nomes      de domínio;</span></li>  <li class=MsoNormal style='color:#555555;text-align:justify;line-height:normal;      background:white'><span style='font-size:10.0pt;font-family:\"Verdana\",sans-serif'>Informações      das URLs acessadas pelo usuário.</span></li> </ul>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Os dados acima coletados, possuem finalidade e são importantes para: pesquisas, estatísticas, de forma a aprimorar nossos serviços no nosso site e oferecer uma melhor experiência de navegação para o consumidor, eles não são usados para venda direta de produtos. </span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>No entanto, existem vários pontos em que você poderá escolher fornecer, voluntariamente, algumas informações para sua identificação: nome completo, telefone de contato, e-mail e outros que venham a ser solicitados durante o processo de cadastramento.</span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Solicitaremos estas informações quando você desejar submeter perguntas; preencher cadastros para pedir contato para compra de nossos produtos e serviços; apresentar comentários sobre alguma empresa do <span style='background:none'>Grupo Liberty Seguros</span>, este site/ aplicativo, nossos produtos e serviços, e outros tópicos.</span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Quando você envia um e-mail ou outro tipo de mensagem para se comunicar com alguma das empresas do <span style='background:none'>Grupo Liberty Seguros</span>, podemos reter essas mensagens para processar suas consultas, responder às suas solicitações e melhorar nossos produtos, atendimento ou mesmo, este site.</span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Todas essas informações serão guardadas por esta empresa, que lhe garante sigilo e confidencialidade, assegurando que não serão transmitidas ou comercializadas a terceiros, sem sua autorização, exceto por imposição legal ou ordem judicial, conforme previsão na Lei 12.965/14, Lei 13.709/18 e/ou qualquer outra que venha a regulamentar o tema.</span></p>  <h5 style='margin-top:7.5pt;margin-right:0cm;margin-bottom:7.5pt;margin-left: 0cm;text-align:justify;background:white'><b><span style='font-size:10.5pt; line-height:107%;font-family:\"Arial\",sans-serif;color:#447ADD'>Utilização de seus dados</span></b></h5>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Como dito acima, as informações fornecidas serão utilizadas, principalmente, para a melhoria de nosso atendimento e de nossos produtos, adequando-os às suas necessidades e interesses.</span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Poderemos nos valer desses dados, ainda, para fins de marketing, pesquisa interna e para lhe enviar atualizações de nossos produtos e serviços ou qualquer outra informação quando entendermos que possa ser de seu interesse. Caso queira interromper o recebimento dessas informações, esses e-mails possuem um dispositivo eletrônico para isso. Basta clicar no link existente na parte inferior do e-mail que o processo de interrupção é realizado automaticamente. Excetuada essa situação, não enviaremos nenhuma informação ou ação de Marketing para o seu e-mail cadastrado. </span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Dados de telemetria só serão utilizados se houver interesse do titular dos dados pessoais em adquirir seguros com tais características e/ou para a concessão de benefícios. </span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Também não forneceremos seus dados para ofertas de produtos de terceiros.</span></p>  <p class=MsoCommentText style='text-align:justify'><span style='font-family: \"Verdana\",sans-serif;color:#555555'>Somente compartilhamos os dados pessoais com os prestadores de serviços, para que sejam atendidos aos princípios estabelecidos no contrato ou definidos na Lei de proteção de dados pessoais vigente. De toda forma informamos que os direitos estabelecidos pela lei serão cumpridos e também estão garantidos em contratos entre a empresa do <span style='background:none'>Grupo Liberty</span> <span style='background:none'>Seguros</span> e o prestador de serviço.</span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>A empresa poderá compartilhar os dados em referência com as demais empresas do <span style='background:none'>Grupo Liberty Seguros</span> e com sua sede, nos EUA.</span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Se decidirmos utilizar essas informações para alguma outra finalidade diferente das acima expostas, solicitaremos o seu prévio consentimento.</span></p>  <h5 style='margin-top:7.5pt;margin-right:0cm;margin-bottom:7.5pt;margin-left: 0cm;text-align:justify;background:white'><b><span style='font-size:10.5pt; line-height:107%;font-family:\"Arial\",sans-serif;color:#447ADD'>Segurança de seus dados</span></b></h5>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Nenhum dado fornecido durante ou pelo preenchimento dos formulários presentes neste site será comercializado, ou divulgado a terceiros, sem sua prévia e expressa autorização, observadas as exceções legais.</span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Suas informações são coletadas e guardadas obedecendo aos mais rígidos padrões de segurança do mercado, e o acesso é limitado somente aos colaboradores e parceiros do <span style='background:none'>Grupo Liberty</span> <span style='background:none'>Seguros</span>, inclusive na sua sede nos EUA, autorizados para o uso adequado dessas informações. Todos os colaboradores e parceiros do <span style='background: none'>Grupo Liberty</span> <span style='background:none'>Seguros</span> têm conhecimento da Política de Privacidade aqui apresentada além de leis aplicáveis ao tratamento de Dados Pessoais e estão comprometidos com a confidencialidade e uso restrito destes dados.</span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>O <span style='background:none'>Grupo Liberty Seguros</span> se compromete a adotar as medidas de segurança adequadas à proteção quanto ao acesso, transferência, alteração ou destruição não autorizada destes dados.</span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>O site, plataformas e aplicações de Internet somente poderão eventualmente ser compartilhados com terceiros mediante ordem judicial ou solicitação do Ministério Público, Autoridade Policial ou Administrativa, nos termos do art. 15, parágrafo 3º, da Lei 12.965/14 e da Lei 13.709/18, ou ainda, se assim for necessário, para cumprimento de lei ou de regulamentação governamental.</span></p>  <h5 style='margin-top:7.5pt;margin-right:0cm;margin-bottom:7.5pt;margin-left: 0cm;text-align:justify;background:white'><b><span style='font-size:10.5pt; line-height:107%;font-family:\"Arial\",sans-serif;color:#447ADD'>Alteração das informações pessoais</span></b></h5>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>O <span style='background:none'>Grupo Liberty Seguros</span> permite que você tenha acesso a todos os dados fornecidos, e admite sua atualização, correção ou mesmo exclusão.</span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>O <span style='background:none'>Grupo Liberty Seguros</span> poderá excluir dos seus sites, plataformas e aplicações de Internet, dados pessoais, mediante requerimento expresso do usuário, por meio de solicitação encaminhada para: ";


            if(BuildConfig.prod) {
                html += "<a href='"+ getString(R.string.url_canal_report_prod) +"'>" + getString(R.string.url_canal_report_prod) + "</a> ";
            }else{
                html += "<a href='"+ getString(R.string.url_canal_report_act) +"'>" + getString(R.string.url_canal_report_act) + "</a> ";
            }

        html += "<span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>ou ainda enviado para </span><a href=\"mailto:dpo@libertyseguros.com.br\"><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif'>dpo@libertyseguros.com.br</span></a><span style='font-size:10.0pt;font-family:\"Verdana\",sans-serif;color:#555555'>, ressalvadas as hipóteses de guarda obrigatória de registros ou dados previstas em lei ou objeto de ordem judicial, do Ministério Público ou de autoridade policial ou administrativa, nos termos do art. 7º, X, da Lei 12.965/14 e nos termos da Lei 13.709/18 ou qualquer outra que o defina.</span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>É reservado a empresa do <span style='background:none'>Grupo Liberty Seguros</span>, editar ou até mesmo excluir qualquer conteúdo publicado pelos usuários que não estejam de acordo com a sua Política de Privacidade.</span></p>  <h5 style='margin-top:7.5pt;margin-right:0cm;margin-bottom:7.5pt;margin-left: 0cm;text-align:justify;background:white'><b><span style='font-size:10.5pt; line-height:107%;font-family:\"Arial\",sans-serif;color:#447ADD'>Cookies</span></b></h5>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Ao utilizar este site, a empresa <span style='background:none'>do Grupo Liberty Seguros</span> pode enviar pequenos arquivos, denominados “cookies” para o seu computador. Estes arquivos têm como objetivo melhorar a sua navegação e funcionalidade, armazenando dados sobre suas visitas, permitindo uma interação mais personalizada com as ferramentas fornecidas pelo site. </span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Estes “cookies” coletam informações que são submetidas de uma página para a próxima página, eliminando a necessidade de inserção de informações redundantes. Os “cookies” não coletam informações pessoais ou quaisquer outras informações do seu computador que possam gerar sua identificação ou que firam critérios éticos e legais de coleta de dados.</span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>A maioria dos navegadores é configurada para aceitar “cookies”, mas é possível alterar as configurações de seu computador para que os “cookies” não sejam aceitos ou que seja indicado quando estão sendo enviados, entretanto, nessa hipótese, algumas páginas do site podem não funcionar.</span></p>  <h5 style='margin-top:7.5pt;margin-right:0cm;margin-bottom:7.5pt;margin-left: 0cm;text-align:justify;background:white'><b><span style='font-size:10.5pt; line-height:107%;font-family:\"Arial\",sans-serif;color:#447ADD'>Spam</span></b></h5>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>O site, plataformas e aplicações de Internet, procurarão evitar o envio de e-mails não – solicitados. Caso o usuário receba alguma mensagem não solicitada ou invasiva, poderá enviar reclamação para&nbsp;</span><a href=\"mailto:privacidade@libertyseguros.com.br\"><span style='font-size:10.0pt;font-family:\"Verdana\",sans-serif;color:#1B407E; text-decoration:none'>privacidade@libertyseguros.com.br</span></a><span style='font-size:10.0pt;font-family:\"Verdana\",sans-serif;color:#555555'>.</span></p>  <h5 style='margin-top:7.5pt;margin-right:0cm;margin-bottom:7.5pt;margin-left: 0cm;text-align:justify;background:white'><b><span style='font-size:10.5pt; line-height:107%;font-family:\"Arial\",sans-serif;color:#447ADD'>Proteção de senha</span></b></h5>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Existem áreas “privativas” no site em que será necessário informar seu login/e-mail e senha para acesso.</span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Mantenha sigilo da sua senha, que é de uso pessoal e intransferível. Se você desconfiar que seu login/e-mail foi comprometido, notifique imediatamente, à empresa do <span style='background: none'>Grupo Liberty Seguros </span>através do e-mail&nbsp;</span><a href=\"mailto:privacidade@libertyseguros.com.br\"><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#1B407E;text-decoration:none'>privacidade@libertyseguros.com.br</span></a><span style='font-size:10.0pt;font-family:\"Verdana\",sans-serif;color:#555555'>.</span></p>  <h5 style='margin-top:7.5pt;margin-right:0cm;margin-bottom:7.5pt;margin-left: 0cm;text-align:justify;background:white'><b><span style='font-size:10.5pt; line-height:107%;font-family:\"Arial\",sans-serif;color:#447ADD'>Alterações na política de privacidade</span></b></h5>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Esta Política de Privacidade pode sofrer alterações periódicas e a qualquer tempo, com ou sem aviso prévio, em virtude de nossa busca por melhoria contínua. Todas as alterações estarão expostas nesta página e, se forem muito significativas, avisos serão disponibilizados em outras páginas deste site garantindo maior destaque. Portanto, recomendamos que consulte esta política periodicamente.</span></p>  <h5 style='margin-top:7.5pt;margin-right:0cm;margin-bottom:7.5pt;margin-left: 0cm;text-align:justify;background:white'><b><span style='font-size:10.5pt; line-height:107%;font-family:\"Arial\",sans-serif;color:#447ADD'>Alcance na política de privacidade</span></b></h5>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Esta Política de Privacidade se aplica somente a <span style='background:none'>este site/ aplicativo.</span> Em que pese poderem existir links para outros sites, como banners, anúncios, etc, estes web sites não estão incluídos nesta Política de Privacidade e não são de responsabilidade da empresa do <span style='background:none'>Grupo Liberty Seguros</span>. O <span style='background:none'>Grupo Liberty Seguros</span> recomenda que você tome ciência da Política de Privacidade de cada <span style='background:none'>site</span>/ aplicativo visitado.</span></p>  <h5 style='margin-top:7.5pt;margin-right:0cm;margin-bottom:7.5pt;margin-left: 0cm;text-align:justify;background:white'><b><span style='font-size:10.5pt; line-height:107%;font-family:\"Arial\",sans-serif;color:#447ADD'>Lei aplicável e Foro competente</span></b></h5>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Esta Política de Privacidade será regida, interpretada e executada de acordo com as leis da República Federativa do Brasil, independentemente dos conflitos dessas leis com leis de outros países, sendo competente o Foro do local de residência do Usuário, no Brasil, para dirimir qualquer dúvida decorrente deste instrumento. </span></p>  <p class=MsoNormal style='text-align:justify'><span style='font-size:10.0pt; line-height:107%;font-family:\"Verdana\",sans-serif;color:#555555'>O Usuário consente, expressamente, com a competência desse juízo, e renúncia, neste ato, à competência de qualquer outro foro, por mais privilegiado que seja ou venha a ser.</span><span style='font-size:10.0pt;line-height:107%;font-family:\"Arial\",sans-serif; color:#555555'><br> <br> </span></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><a><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555;background:none'>Liberty Seguros S.A</span></a></p>  <p style='margin-top:0cm;margin-right:0cm;margin-bottom:18.75pt;margin-left: 0cm;text-align:justify;background:white'><span style='font-size:10.0pt; font-family:\"Verdana\",sans-serif;color:#555555'>Última atualização: 19 de Junho de 2020</span></p>  <p class=MsoNormal>&nbsp;</p>  <p class=MsoNormal style='text-align:justify'>&nbsp;</p>  </div>   </body>  </html> ";

        webView.loadData(html, "text/html; charset=utf-8", "utf-8");


    }

}