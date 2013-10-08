
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String, titlePagina: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.53*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/(""" - """),_display_(Seq[Any](/*7.26*/titlePagina)),format.raw/*7.37*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/style.css"))),format.raw/*8.95*/("""" />
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        
		<!--  jquery core -->
		<!-- 
			<script src=""""),_display_(Seq[Any](/*13.18*/routes/*13.24*/.Assets.at("javascripts/jquery/jquery-1.4.1.min.js"))),format.raw/*13.76*/("""" src="" type="text/javascript"></script>
		 -->
        <script src=""""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*15.74*/("""" type="text/javascript"></script>
        <!--  checkbox styling script -->
		<script src=""""),_display_(Seq[Any](/*17.17*/routes/*17.23*/.Assets.at("javascripts/ddaccordion.js"))),format.raw/*17.63*/("""" type="text/javascript"></script>
		
		<script type="text/javascript">
			ddaccordion.init("""),format.raw/*20.21*/("""{"""),format.raw/*20.22*/("""
				headerclass: "submenuheader", //Shared CSS class name of headers group
				contentclass: "submenu", //Shared CSS class name of contents group
				revealtype: "click", //Reveal content when user clicks or onmouseover the header? Valid value: "click", "clickgo", or "mouseover"
				mouseoverdelay: 200, //if revealtype="mouseover", set delay in milliseconds before header expands onMouseover
				collapseprev: true, //Collapse previous content (so only one open at any time)? true/false 
				defaultexpanded: [], //index of content(s) open by default [index1, index2, etc] [] denotes no content
				onemustopen: false, //Specify whether at least one header should be open always (so never all headers closed)
				animatedefault: false, //Should contents open by default be animated into view?
				persiststate: true, //persist state of opened contents within browser session?
				toggleclass: ["", ""], //Two CSS classes to be applied to the header when it's collapsed and expanded, respectively ["class1", "class2"]
				togglehtml: ["suffix", "<img src='/assets/images/plus.gif' class='statusicon' />", "<img src='/assets/images/minus.gif' class='statusicon' />"], //Additional HTML added to the header when it's collapsed and expanded, respectively  ["position", "html1", "html2"] (see docs)
				animatespeed: "fast", //speed of animation: integer in milliseconds (ie: 200), or keywords "fast", "normal", or "slow"
				oninit:function(headers, expandedindices)"""),format.raw/*33.46*/("""{"""),format.raw/*33.47*/(""" //custom code to run when headers have initalized
					//do nothing
				"""),format.raw/*35.5*/("""}"""),format.raw/*35.6*/(""",
				onopenclose:function(header, index, state, isuseractivated)"""),format.raw/*36.64*/("""{"""),format.raw/*36.65*/(""" //custom code to run whenever a header is opened or closed
					//do nothing
				"""),format.raw/*38.5*/("""}"""),format.raw/*38.6*/("""
			"""),format.raw/*39.4*/("""}"""),format.raw/*39.5*/(""");
		</script>
		
		<script src=""""),_display_(Seq[Any](/*42.17*/routes/*42.23*/.Assets.at("javascripts/jquery.jclock-1.2.0.js.txt"))),format.raw/*42.75*/("""" type="text/javascript"></script>
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*43.40*/routes/*43.46*/.Assets.at("javascripts/jconfirmaction.jquery.js"))),format.raw/*43.96*/(""""></script>
		<script type="text/javascript">
			
			$(document).ready(function() """),format.raw/*46.33*/("""{"""),format.raw/*46.34*/("""
				$('.ask').jConfirmAction();
			"""),format.raw/*48.4*/("""}"""),format.raw/*48.5*/(""");
			
		</script>
		
		<script type="text/javascript">
			$(function($) """),format.raw/*53.18*/("""{"""),format.raw/*53.19*/("""
			    $('.jclock').jclock();
			"""),format.raw/*55.4*/("""}"""),format.raw/*55.5*/(""");
		</script>
		
		<script language="javascript" type="text/javascript" src=""""),_display_(Seq[Any](/*58.62*/routes/*58.68*/.Assets.at("javascripts/niceforms.js"))),format.raw/*58.106*/(""""></script>
		<link rel="stylesheet" type="text/css" media="all" href=""""),_display_(Seq[Any](/*59.61*/routes/*59.67*/.Assets.at("stylesheets/niceforms-default.css"))),format.raw/*59.114*/("""" />
		
    </head>
    <body>
		<div id="main_container">
			
			<div class="header">
    			<div class="logo">
    				<a href="#">
    					<img src=""""),_display_(Seq[Any](/*68.21*/routes/*68.27*/.Assets.at("images/logo.gif"))),format.raw/*68.56*/("""" alt="" title="" border="0" />
    				</a>
    			</div>
    
    			<div class="right_header">
    				Welcome Admin, <a href="#">Visit site</a> | <a href="#" class="messages">(3) Messages</a> | <a href="#" class="logout">Logout</a>
    			</div>
    			
    			<div class="jclock"></div>
    		</div>
    		
    		<div class="main_content">
    			
    			<div class="menu">
                    <ul>
                    	<li><a class="current" href="index.html">Admin Home</a></li>
                    	<li><a href="list.html">Manage Categories<!--[if IE 7]><!--></a><!--<![endif]-->
                    		<!--[if lte IE 6]><table><tr><td><![endif]-->
                        	<ul>
                        		<li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
                        		<li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
                        		<li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
                        		<li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
                        		<li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
                        	</ul>
                    		<!--[if lte IE 6]></td></tr></table></a><![endif]-->
                   		</li>
                    	<li><a href="login.html">Manage Users<!--[if IE 7]><!--></a><!--<![endif]-->
                    		<!--[if lte IE 6]><table><tr><td><![endif]-->
                        	<ul>
                        		<li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
                        		<li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
                        		<li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
                        		<li><a class="sub1" href="" title="">sublevel2<!--[if IE 7]><!--></a><!--<![endif]-->
                        			<!--[if lte IE 6]><table><tr><td><![endif]-->
	                            	<ul>
	                                	<li><a href="" title="">sublevel link</a></li>
                                		<li><a href="" title="">sulevel link</a></li>
                                		<li><a class="sub2" href="#nogo">sublevel3<!--[if IE 7]><!--></a><!--<![endif]-->
	                        
                                			<!--[if lte IE 6]><table><tr><td><![endif]-->
                                    		<ul>
		                                        <li><a href="#nogo">Third level-1</a></li>
                                        		<li><a href="#nogo">Third level-2</a></li>
                                        		<li><a href="#nogo">Third level-3</a></li>
                                        		<li><a href="#nogo">Third level-4</a></li>
                                    		</ul>
	                        
                                			<!--[if lte IE 6]></td></tr></table></a><![endif]-->
                                		</li>
                                		<li><a href="" title="">sulevel link</a></li>
                            		</ul>
                        			<!--[if lte IE 6]></td></tr></table></a><![endif]-->
                        		</li>
                    
                         		<li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
                        	</ul>
                    		<!--[if lte IE 6]></td></tr></table></a><![endif]-->
                    	</li>
                    	<li><a href="login.html">Manage Orders<!--[if IE 7]><!--></a><!--<![endif]-->
                    		<!--[if lte IE 6]><table><tr><td><![endif]-->
                        	<ul>
                        		<li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
                        		<li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
                        		<li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
                        		<li><a class="sub1" href="" title="">sublevel2<!--[if IE 7]><!--></a><!--<![endif]-->
                        			<!--[if lte IE 6]><table><tr><td><![endif]-->
                            		<ul>
                                		<li><a href="" title="">sublevel link</a></li>
                                		<li><a href="" title="">sulevel link</a></li>
                                		<li><a class="sub2" href="#nogo">sublevel3<!--[if IE 7]><!--></a><!--<![endif]-->
                        
                                			<!--[if lte IE 6]><table><tr><td><![endif]-->
                                    		<ul>
                                        		<li><a href="#nogo">Third level-1</a></li>
                                        		<li><a href="#nogo">Third level-2</a></li>
                                        		<li><a href="#nogo">Third level-3</a></li>
                                        		<li><a href="#nogo">Third level-4</a></li>
                                    		</ul>
                        
                                			<!--[if lte IE 6]></td></tr></table></a><![endif]-->
                                		</li>
                                		<li><a href="" title="">sulevel link</a></li>
                            		</ul>
                        			<!--[if lte IE 6]></td></tr></table></a><![endif]-->
                        		</li>
                    
                         		<li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
                        	</ul>
                    		<!--[if lte IE 6]></td></tr></table></a><![endif]-->
                    	</li>
                    	<li><a href="login.html">Settings<!--[if IE 7]><!--></a><!--<![endif]-->
                    		<!--[if lte IE 6]><table><tr><td><![endif]-->
                        	<ul>
                        		<li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
                        		<li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
                        		<li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
                        		<li><a class="sub1" href="" title="">sublevel2<!--[if IE 7]><!--></a><!--<![endif]-->
                        			<!--[if lte IE 6]><table><tr><td><![endif]-->
                            		<ul>
                                		<li><a href="" title="">sublevel link</a></li>
                                		<li><a href="" title="">sulevel link</a></li>
                                		<li><a class="sub2" href="#nogo">sublevel3<!--[if IE 7]><!--></a><!--<![endif]-->
                        
                                			<!--[if lte IE 6]><table><tr><td><![endif]-->
                                    		<ul>
                                        		<li><a href="#nogo">Third level-1</a></li>
                                        		<li><a href="#nogo">Third level-2</a></li>
                                        		<li><a href="#nogo">Third level-3</a></li>
                                        		<li><a href="#nogo">Third level-4</a></li>
                                    		</ul>
                        
                                			<!--[if lte IE 6]></td></tr></table></a><![endif]-->
                                		</li>
                                		<li><a href="" title="">sulevel link</a></li>
                            		</ul>
                        			<!--[if lte IE 6]></td></tr></table></a><![endif]-->
                        		</li>
	                    
                         		<li><a href="" title="">Lorem ipsum dolor sit amet</a></li>
                        	</ul>
                    		<!--[if lte IE 6]></td></tr></table></a><![endif]-->
                    	</li>
                    	<li><a href="">Templates</a></li>
                    	<li><a href="">Custom details</a></li>
                    	<li><a href="">Contact</a></li>
                    </ul>
				</div>
				
				<div class="center_content">
					<div class="left_content">
						
			    		<div class="sidebar_search">
			            	<form>
			            		<input type="text" name="" class="search_input" value="search keyword" onclick="this.value=''" />
			            		<input type="image" class="search_submit" src=""""),_display_(Seq[Any](/*203.66*/routes/*203.72*/.Assets.at("images/search.png"))),format.raw/*203.103*/("""" />
			            	</form>            
			            </div>
			            
			            <div class="sidebarmenu">
            
			                <a class="menuitem submenuheader" href="">Subcategories</a>
			                <div class="submenu">
			                    <ul>
			                    <li><a href="">Sidebar submenu</a></li>
			                    <li><a href="">Sidebar submenu</a></li>
			                    <li><a href="">Sidebar submenu</a></li>
			                    <li><a href="">Sidebar submenu</a></li>
			                    <li><a href="">Sidebar submenu</a></li>
			                    </ul>
			                </div>
			                <a class="menuitem submenuheader" href="" >Sidebar Settings</a>
			                <div class="submenu">
			                    <ul>
			                    <li><a href="">Sidebar submenu</a></li>
			                    <li><a href="">Sidebar submenu</a></li>
			                    <li><a href="">Sidebar submenu</a></li>
			                    <li><a href="">Sidebar submenu</a></li>
			                    <li><a href="">Sidebar submenu</a></li>
			                    </ul>
			                </div>
			                <a class="menuitem submenuheader" href="">Add new products</a>
			                <div class="submenu">
			                    <ul>
			                    <li><a href="">Sidebar submenu</a></li>
			                    <li><a href="">Sidebar submenu</a></li>
			                    <li><a href="">Sidebar submenu</a></li>
			                    <li><a href="">Sidebar submenu</a></li>
			                    <li><a href="">Sidebar submenu</a></li>
			                    </ul>
			                </div>
			                <a class="menuitem" href="">User Reference</a>
			                <a class="menuitem" href="">Blue button</a>
			                
			                <a class="menuitem_green" href="">Green button</a>
			                
			                <a class="menuitem_red" href="">Red button</a>
			                    
			            </div>
			            
			            <div class="sidebar_box">
			                <div class="sidebar_box_top"></div>
			                <div class="sidebar_box_content">
			                <h3>User help desk</h3>
			                <img src=""""),_display_(Seq[Any](/*252.31*/routes/*252.37*/.Assets.at("images/info.png"))),format.raw/*252.66*/("""" alt="" title="" class="sidebar_icon_right" />
			                <p>
			Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
			                </p>                
			                </div>
			                <div class="sidebar_box_bottom"></div>
			            </div>
			            
			            <div class="sidebar_box">
			                <div class="sidebar_box_top"></div>
			                <div class="sidebar_box_content">
			                	<h4>Important notice</h4>
			                	<img src=""""),_display_(Seq[Any](/*264.32*/routes/*264.38*/.Assets.at("images/notice.png"))),format.raw/*264.69*/("""" alt="" title="" class="sidebar_icon_right" />
			                	<p>
									Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
			                	</p>                
		                	</div>
			                <div class="sidebar_box_bottom"></div>
			            </div>
			            
			            <div class="sidebar_box">
			                <div class="sidebar_box_top"></div>
			                <div class="sidebar_box_content">
				                <h5>Download photos</h5>
			                	<img src=""""),_display_(Seq[Any](/*276.32*/routes/*276.38*/.Assets.at("images/photo.png"))),format.raw/*276.68*/("""" alt="" title="" class="sidebar_icon_right" />
			                	<p>
									Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
			                	</p>                
			                </div>
			                <div class="sidebar_box_bottom"></div>
			            </div>  
			            
			            <div class="sidebar_box">
			                <div class="sidebar_box_top"></div>
			                <div class="sidebar_box_content">
			                	<h3>To do List</h3>
			                	<img src=""""),_display_(Seq[Any](/*288.32*/routes/*288.38*/.Assets.at("images/info.png"))),format.raw/*288.67*/("""" alt="" title="" class="sidebar_icon_right" />
			                	<ul>
			                		<li>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</li>
			                 		<li>Lorem ipsum dolor sit ametconsectetur <strong>adipisicing</strong> elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</li>
			                  		<li>Lorem ipsum dolor sit amet, consectetur <a href="#">adipisicing</a> elit.</li>
			                   		<li>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</li>
			                   		<li>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</li>
			                     	<li>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</li>
			                	</ul>                
			                </div>
			                <div class="sidebar_box_bottom"></div>
			            </div>
		           	</div>
		           	
		           	<div class="right_content">
		           		
		           		<h2>"""),_display_(Seq[Any](/*304.21*/titlePagina)),format.raw/*304.32*/("""</h2>
		           		
		           		"""),_display_(Seq[Any](/*306.17*/content)),format.raw/*306.24*/("""
		           		
		           		<!-- 
		           		
		           		
		           		<table id="rounded-corner" summary="2007 Major IT Companies' Profit">
						    <thead>
						    	<tr>
						        	<th scope="col" class="rounded-company"></th>
						            <th scope="col" class="rounded">Product</th>
						            <th scope="col" class="rounded">Details</th>
						            <th scope="col" class="rounded">Price</th>
						            <th scope="col" class="rounded">Date</th>
						            <th scope="col" class="rounded">Edit</th>
						            <th scope="col" class="rounded-q4">Delete</th>
						        </tr>
						    </thead>
						        <tfoot>
						    	<tr>
						        	<td colspan="6" class="rounded-foot-left"><em>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.</em></td>
						        	<td class="rounded-foot-right">&nbsp;</td>
						
						        </tr>
						    </tfoot>
						    <tbody>
						    	<tr>
						        	<td><input type="checkbox" name="" /></td>
						            <td>Product name</td>
						            <td>details</td>
						            <td>150$</td>
						            <td>12/05/2010</td>
						
						            <td><a href="#"><img src=""""),_display_(Seq[Any](/*338.46*/routes/*338.52*/.Assets.at("images/user_edit.png"))),format.raw/*338.86*/("""" alt="" title="" border="0" /></a></td>
						            <td><a href="#" class="ask"><img src=""""),_display_(Seq[Any](/*339.58*/routes/*339.64*/.Assets.at("images/trash.png"))),format.raw/*339.94*/("""" alt="" title="" border="0" /></a></td>
						        </tr>
						        
						    	<tr>
						        	<td><input type="checkbox" name="" /></td>
						            <td>Product name</td>
						            <td>details</td>
						            <td>150$</td>
						            <td>12/05/2010</td>
						
						            <td><a href="#"><img src=""""),_display_(Seq[Any](/*349.46*/routes/*349.52*/.Assets.at("images/user_edit.png"))),format.raw/*349.86*/("""" alt="" title="" border="0" /></a></td>
						            <td><a href="#" class="ask"><img src=""""),_display_(Seq[Any](/*350.58*/routes/*350.64*/.Assets.at("images/trash.png"))),format.raw/*350.94*/("""" alt="" title="" border="0" /></a></td>
						        </tr> 
						        
						    	<tr>
						        	<td><input type="checkbox" name="" /></td>
						            <td>Product name</td>
						            <td>details</td>
						            <td>150$</td>
						            <td>12/05/2010</td>
						
						            <td><a href="#"><img src=""""),_display_(Seq[Any](/*360.46*/routes/*360.52*/.Assets.at("images/user_edit.png"))),format.raw/*360.86*/("""" alt="" title="" border="0" /></a></td>
						            <td><a href="#" class="ask"><img src=""""),_display_(Seq[Any](/*361.58*/routes/*361.64*/.Assets.at("images/trash.png"))),format.raw/*361.94*/("""" alt="" title="" border="0" /></a></td>
						        </tr>
						        
						    	<tr>
						        	<td><input type="checkbox" name="" /></td>
						            <td>Product name</td>
						            <td>details</td>
						            <td>150$</td>
						            <td>12/05/2010</td>
						
						            <td><a href="#"><img src=""""),_display_(Seq[Any](/*371.46*/routes/*371.52*/.Assets.at("images/user_edit.png"))),format.raw/*371.86*/("""" alt="" title="" border="0" /></a></td>
						            <td><a href="#" class="ask"><img src=""""),_display_(Seq[Any](/*372.58*/routes/*372.64*/.Assets.at("images/trash.png"))),format.raw/*372.94*/("""" alt="" title="" border="0" /></a></td>
						        </tr>  
						    	<tr>
						        	<td><input type="checkbox" name="" /></td>
						            <td>Product name</td>
						            <td>details</td>
						            <td>150$</td>
						            <td>12/05/2010</td>
						
						            <td><a href="#"><img src=""""),_display_(Seq[Any](/*381.46*/routes/*381.52*/.Assets.at("images/user_edit.png"))),format.raw/*381.86*/("""" alt="" title="" border="0" /></a></td>
						            <td><a href="#" class="ask"><img src=""""),_display_(Seq[Any](/*382.58*/routes/*382.64*/.Assets.at("images/trash.png"))),format.raw/*382.94*/("""" alt="" title="" border="0" /></a></td>
						        </tr>
						        
						    	<tr>
						        	<td><input type="checkbox" name="" /></td>
						            <td>Product name</td>
						            <td>details</td>
						            <td>150$</td>
						            <td>12/05/2010</td>
						
						            <td><a href="#"><img src=""""),_display_(Seq[Any](/*392.46*/routes/*392.52*/.Assets.at("images/user_edit.png"))),format.raw/*392.86*/("""" alt="" title="" border="0" /></a></td>
						            <td><a href="#" class="ask"><img src=""""),_display_(Seq[Any](/*393.58*/routes/*393.64*/.Assets.at("images/trash.png"))),format.raw/*393.94*/("""" alt="" title="" border="0" /></a></td>
						        </tr>    
						        
						    </tbody>
						</table>
						
						<a href="#" class="bt_green"><span class="bt_green_lft"></span><strong>Add new item</strong><span class="bt_green_r"></span></a>
     					<a href="#" class="bt_blue"><span class="bt_blue_lft"></span><strong>View all items from category</strong><span class="bt_blue_r"></span></a>
     					<a href="#" class="bt_red"><span class="bt_red_lft"></span><strong>Delete items</strong><span class="bt_red_r"></span></a>
     					
     					<div class="pagination">
        					<span class="disabled"><< prev</span><span class="current">1</span><a href="">2</a><a href="">3</a><a href="">4</a><a href="">5</a>�<a href="">10</a><a href="">11</a><a href="">12</a>...<a href="">100</a><a href="">101</a><a href="">next >></a>
        				</div>
        				
        				<h2>Warning Box examples</h2>
      
					     <div class="warning_box">
					        Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.
					     </div>
					     <div class="valid_box">
					        Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.
					     </div>
					     <div class="error_box">
					        Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut.
					     </div>  
					           
					     <h2>Nice Form example</h2>
					     
					         <div class="form">
					         	<form action="" method="post" class="niceform">
					            	<fieldset>
					                    <dl>
					                        <dt><label for="email">Email Address:</label></dt>
					                        <dd><input type="text" name="" id="" size="54" /></dd>
					                    </dl>
					                    <dl>
					                        <dt><label for="password">Password:</label></dt>
					                        <dd><input type="text" name="" id="" size="54" /></dd>
					                    </dl>
					                    
					                    
					                    <dl>
					                        <dt><label for="gender">Select categories:</label></dt>
					                        <dd>
					                            <select size="1" name="gender" id="">
					                                <option value="">Select option 1</option>
					                                <option value="">Select option 2</option>
					                                <option value="">Select option 3</option>
					                                <option value="">Select option 4</option>
					                                <option value="">Select option 5</option>
					                            </select>
					                        </dd>
					                    </dl>
					                    <dl>
					                        <dt><label for="interests">Select tags:</label></dt>
					                        <dd>
					                            <input type="checkbox" name="interests[]" id="" value="" /><label class="check_label">Web design</label>
					                            <input type="checkbox" name="interests[]" id="" value="" /><label class="check_label">Business</label>
					                            <input type="checkbox" name="interests[]" id="" value="" /><label class="check_label">Simple</label>
					                            <input type="checkbox" name="interests[]" id="" value="" /><label class="check_label">Clean</label>
					                        </dd>
					                    </dl>
					                    
					                    <dl>
					                        <dt><label for="color">Select type</label></dt>
					                        <dd>
					                            <input type="radio" name="type" id="" value="" /><label class="check_label">Basic</label>
					                            <input type="radio" name="type" id="" value="" /><label class="check_label">Medium</label>
					                            <input type="radio" name="type" id="" value="" /><label class="check_label">Premium</label>
					                        </dd>
					                    </dl>
					                    
					                    
					                    
					                    <dl>
					                        <dt><label for="upload">Upload a File:</label></dt>
					                        <dd><input type="file" name="upload" id="upload" /></dd>
					                    </dl>
					                    
					                    <dl>
					                        <dt><label for="comments">Message:</label></dt>
					                        <dd><textarea name="comments" id="comments" rows="5" cols="36"></textarea></dd>
					                    </dl>
					                    
					                    <dl>
					                        <dt><label></label></dt>
					                        <dd>
					                            <input type="checkbox" name="interests[]" id="" value="" /><label class="check_label">I agree to the <a href="#">terms &amp; conditions</a></label>
					                        </dd>
					                    </dl>
					                    
					                     <dl class="submit">
					                    	<input type="submit" name="submit" id="submit" value="Submit" />
					                     </dl>
					                </fieldset>    
					         	</form>
					         </div> 
						-->
		        	</div>   	
		         </div>
		         
		         <div class="clear"></div>          
    		</div>
    		
    		<div class="footer">
		    
		    	<div class="left_footer">IN ADMIN PANEL | Powered by <a href="http://indeziner.com">INDEZINER</a></div>
		    	<div class="right_footer"><a href="http://indeziner.com"><img src=""""),_display_(Seq[Any](/*500.76*/routes/*500.82*/.Assets.at("images/indeziner_logo.gif"))),format.raw/*500.121*/("""" alt="" title="" border="0" /></a></div>
		    
		    </div>
    		
   		</div>
		
			
				<!-- 
			    	<div class="div_principal">
				    	<div class="topo">
				    	</div>
				    	<div class="menu_lateral">
				    	</div>
				    	<div class="conteudo">
				    		--arroba--content
				    	</div>
				    	<div class="rodape">
				    	</div>
			    	</div>
				 -->
        
    </body>
</html>
"""))}
    }
    
    def render(title:String,titlePagina:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,titlePagina)(content)
    
    def f:((String,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,titlePagina) => (content) => apply(title,titlePagina)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 08 15:47:58 GMT-03:00 2013
                    SOURCE: C:/Users/gesse.silva/git/sussu_guia/app/views/main.scala.html
                    HASH: 6a4bf1b7ab17a480c27f53c4fbe6f78dca20947e
                    MATRIX: 785->1|930->52|1024->111|1050->116|1089->120|1121->131|1219->194|1233->200|1289->235|1388->299|1402->305|1455->337|1556->402|1571->408|1645->460|1754->533|1769->539|1836->584|1967->679|1982->685|2044->725|2167->820|2196->821|3702->2299|3731->2300|3833->2375|3861->2376|3955->2442|3984->2443|4095->2527|4123->2528|4155->2533|4183->2534|4256->2571|4271->2577|4345->2629|4456->2704|4471->2710|4543->2760|4656->2845|4685->2846|4750->2884|4778->2885|4884->2963|4913->2964|4976->3000|5004->3001|5122->3083|5137->3089|5198->3127|5307->3200|5322->3206|5392->3253|5591->3416|5606->3422|5657->3451|13919->11676|13935->11682|13990->11713|16359->14045|16375->14051|16427->14080|17063->14679|17079->14685|17133->14716|17776->15322|17792->15328|17845->15358|18485->15961|18501->15967|18553->15996|19580->16986|19614->16997|19691->17037|19721->17044|21048->18334|21064->18340|21121->18374|21257->18473|21273->18479|21326->18509|21720->18866|21736->18872|21793->18906|21929->19005|21945->19011|21998->19041|22393->19399|22409->19405|22466->19439|22602->19538|22618->19544|22671->19574|23065->19931|23081->19937|23138->19971|23274->20070|23290->20076|23343->20106|23723->20449|23739->20455|23796->20489|23932->20588|23948->20594|24001->20624|24395->20981|24411->20987|24468->21021|24604->21120|24620->21126|24673->21156|30592->27038|30608->27044|30671->27083
                    LINES: 26->1|29->1|35->7|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|41->13|41->13|41->13|43->15|43->15|43->15|45->17|45->17|45->17|48->20|48->20|61->33|61->33|63->35|63->35|64->36|64->36|66->38|66->38|67->39|67->39|70->42|70->42|70->42|71->43|71->43|71->43|74->46|74->46|76->48|76->48|81->53|81->53|83->55|83->55|86->58|86->58|86->58|87->59|87->59|87->59|96->68|96->68|96->68|231->203|231->203|231->203|280->252|280->252|280->252|292->264|292->264|292->264|304->276|304->276|304->276|316->288|316->288|316->288|332->304|332->304|334->306|334->306|366->338|366->338|366->338|367->339|367->339|367->339|377->349|377->349|377->349|378->350|378->350|378->350|388->360|388->360|388->360|389->361|389->361|389->361|399->371|399->371|399->371|400->372|400->372|400->372|409->381|409->381|409->381|410->382|410->382|410->382|420->392|420->392|420->392|421->393|421->393|421->393|528->500|528->500|528->500
                    -- GENERATED --
                */
            